import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Studentdetails {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      try{
    	   factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      Studentdetails st = new Studentdetails();
   

     
      Integer SID1 = st.addStudent(12,"pavani",41);
     Integer SID2 = st.addStudent(13,"swathi",42);
      Integer SID3 = st.addStudent(18,"ramya",43);

    
      st.updateStudent(SID1,"sivani");
      st.deleteStudent(SID2);
   
    
   }
  
  public Integer addStudent(int sid,String name, int rollno){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer SID = null;
      try{
         tx = session.beginTransaction();
         Student Student = new Student(sid,name,rollno);
         SID = (Integer) session.save(Student); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return SID;
   }

      public void updateStudent(Integer SID ,String name ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Student Student = 
	                    (Student)session.get(Student.class, SID); 
	         Student.setName(name);
			 session.update(Student); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
      }
	      public void deleteStudent(Integer SID){
	          Session session = factory.openSession();
	          Transaction tx = null;
	          try{
	             tx = session.beginTransaction();
	             Student Student = 
	                       (Student)session.get(Student.class, SID); 
	             session.delete(Student); 
	             tx.commit();
	          }catch (HibernateException e) {
	             if (tx!=null) tx.rollback();
	             e.printStackTrace(); 
	          }finally {
	             session.close(); 
	          }
	       }
	   }
      
 
   