package home.TestNg;


import java.io.File;
import java.util.Collections;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 InvocationRequest request = new DefaultInvocationRequest();
//    	 System.out.print(System.getProperty("user.dir")+File.separator+"pom.xml");
         request.setPomFile( new File( System.getProperty("user.dir")+File.separator+"pom.xml" ));
         request.setGoals( Collections.singletonList( "install" ));
         Invoker invoker = new DefaultInvoker();
         invoker.setMavenHome(new File(System.getenv("MAVEN_HOME").trim()));
         try {
             invoker.execute( request );
         } catch (MavenInvocationException e) {
             e.printStackTrace();
         } 
    }
}

/**
 * https://stackoverflow.com/questions/25804102/executable-jar-for-selenium-testng-maven-project-which-dont-have-a-main-class
 */
