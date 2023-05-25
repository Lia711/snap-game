import java.util.Timer;
import java.util.TimerTask;
import java.io.*;
public class TimedAnswer
{
    private String str = "";

    TimerTask task = new TimerTask()
    {
        public void run()
        {
            if( str.equals("") )
            {
                System.out.println( "You have failed to input anything." );
                System.exit( 0 );
            }
        }
    };

    public void getInput() throws Exception
    {
        Timer timer = new Timer();
        timer.schedule( task, 5*1000 );

        System.out.println( "Snap Opportunity! Enter \"snap\" into the keyboard within 2 seconds!" );
        BufferedReader in = new BufferedReader(
                new InputStreamReader( System.in ) );
        str = in.readLine();

        timer.cancel();
        System.out.println( "you have entered: "+ str );
    }

    public String returnStr() {
        return str;
    }

    public void runTimer() {
        try
        {
            (new TimedAnswer()).getInput();
        }
        catch( Exception e )
        {
            System.out.println( e );
        }
    }

}


