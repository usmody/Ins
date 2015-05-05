package net.insurance.email;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmailSendingServlet")
public class EmailSendingServlet extends HttpServlet {
	private String host;
    private String port;
    private String user;
    private String pass;
 
    public void init() {
        // reads SMTP server setting from web.xml file
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
    }
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // reads form fields
        String recipient = request.getParameter("recipient");
        String subject = request.getParameter("subject");
        
        String content = getQuestionnaireData(request);
 
        String resultMessage = "";
 
        try {
            AutoQuestionnaireSend.sendEmail(host, port, user, pass, "udai.pexa@gmail.com", "Auto Questionnaire",
                    content);
            resultMessage = "The e-mail was sent successfully";
        } catch (Exception ex) {
            ex.printStackTrace();
            resultMessage = "There were an error: " + ex.getMessage();
        } finally {
            request.setAttribute("Message", resultMessage);
            getServletContext().getRequestDispatcher("/Result.jsp").forward(
                    request, response);
        }
    }
    
    private StringBuilder formatQuestionnaireData(StringBuilder sb, String fieldName, String data){
    	sb.append(fieldName);
    	sb.append(":");
    	sb.append("\t");
    	sb.append(data);
    	sb.append("\n");
    	return sb;
    }
    
    private String getQuestionnaireData(HttpServletRequest request){
    	String firstName = request.getParameter("firstName");
    	String lastName = request.getParameter("lastName");
    	String dob = request.getParameter("dob");
    	String relationship = request.getParameter("relationship");
    	String driversLicense = request.getParameter("driversLicense");
    	String dateOfLicense = request.getParameter("dateOfLicense");
    	String occupation = request.getParameter("occupation");
    	String degreeType = request.getParameter("degreeType");
    	String employerName = request.getParameter("employerName");
    	String employerAddress = request.getParameter("employerAddress");
    	String phoneNumber = request.getParameter("phoneNumber");
    	String garagingAddress = request.getParameter("garagingAddress");
    	String vin1 = request.getParameter("vin1");
    	String vin2 = request.getParameter("vin2");
    	String vin3 = request.getParameter("vin3");
    	String vin4 = request.getParameter("vin4");
    	String vin5 = request.getParameter("vin5");
    	
    	StringBuilder sb = new StringBuilder();
    
    	formatQuestionnaireData(sb, "firstName", firstName);
    	formatQuestionnaireData(sb, "lastName", lastName);
    	formatQuestionnaireData(sb, "dob", dob);
    	formatQuestionnaireData(sb, "relationship", relationship);
    	formatQuestionnaireData(sb, "driversLicense", driversLicense);
    	formatQuestionnaireData(sb, "dateOfLicense", dateOfLicense);
    	formatQuestionnaireData(sb, "occupation", occupation);
    	formatQuestionnaireData(sb, "degreeType", degreeType);
    	formatQuestionnaireData(sb, "employerName", employerName);
    	formatQuestionnaireData(sb, "employerAddress", employerAddress);
    	formatQuestionnaireData(sb, "phoneNumber", phoneNumber);
    	formatQuestionnaireData(sb, "garagingAddress", garagingAddress);
    	formatQuestionnaireData(sb, "vin1", vin1);
    	formatQuestionnaireData(sb, "vin2", vin2);
    	formatQuestionnaireData(sb, "vin3", vin3);
    	formatQuestionnaireData(sb, "vin4", vin4);
    	formatQuestionnaireData(sb, "vin5", vin5);
    	
    	return sb.toString();
    }
}
