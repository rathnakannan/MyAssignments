package week1.day2;

public class browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       browser firefox= new browser();
       firefox.launchBrowser("firefox");
       firefox.loadUrl();
	}
       public String launchBrowser(String browserName)
       {  
    	   System.out.println("browser launched successfully");
    	   return browserName;
       }
       public void loadUrl()
       {
    	   System.out.println("Application URL loaded successfully");
       }
	}


