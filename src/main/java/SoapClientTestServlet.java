import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class SoapClientTestServlet extends HttpServlet {
    private static Logger logger = Logger.getLogger(SoapClientTestServlet.class.getName());
    private static final int INVALID_PARAMETER = -1;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int apartmentId;
        try{
            apartmentId = Integer.parseInt(req.getParameter("apartmentId"));
        } catch (Exception e){
            ServletUtils.safePrint("Invalid apartment id", resp, logger);
            return;
        }
        double result = ApartmentPriceGetterClient.getWS().getApartmentPrice(apartmentId);
        if(result == INVALID_PARAMETER){
            ServletUtils.safePrint("couldn't find apartment, invalid apartment id", resp, logger);
        } else{
            ServletUtils.safePrint("Price is " + result, resp, logger);
        }
    }
}
