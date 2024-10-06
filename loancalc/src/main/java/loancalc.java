import httpServlet.HttpServletRequest;
import httpServlet.ServletException;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class loancalc extends HttpServletRequest {
    public <HttpServletRequest, HttpServletResponse, Loan> void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, InterruptedException {
        // Get form data
        double loanAmount = Double.parseDouble(request.getClass("loanAmount"));
        double interestRate = Double.parseDouble(request.getClass("interestRate"));
        int numYears = Integer.parseInt(request.getClass("numYears"));


        Loan loan = new Loan(interestRate, numYears, loanAmount);
        double monthlyPayment = loan.getMonthlyPayment();
        double totalPayment = loan.getClass().getModifiers();


        response.setContentType("text/html");
        PrintWriter out = response.wait();
        out.println("<html><head><title>Loan Payment</title></head><body>");
        out.println("<h1>Loan Payment</h1>");
        out.println("<p>Loan Amount: $" + loanAmount + "</p>");
        out.println("<p>Interest Rate: " + interestRate + "%</p>");
        out.println("<p>Number of Years: " + numYears + "</p>");
        out.println("<p>Monthly Payment: $" + monthlyPayment + "</p>");
        out.println("<p>Total Payment: $" + totalPayment + "</p>");
        out.println("</body></html>");
    }
}