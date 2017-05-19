package classes;

	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	@SuppressWarnings("serial")
	public class CurrencyConverterGBP extends JFrame
	{

	    //three panels for the GUI
	    private JPanel inputPanel;
	    private JPanel resultPanel;
	    private JPanel menuPanel;
	    //labels that identify the fields
	    private JLabel promptLabel;
	    private JLabel resultLabel;
	    private JLabel selectLabel;
	    //menu for the list of currencies
	    private JMenu currencyMenu;
	    private JMenuBar currencyMenuBar;
	    //input field for user to enter currency
	    private JTextField inputField;
	    private JButton convertButton;
	    private JButton clearButton;
	    
	    


	    //initial values for each currency to 1 BGN
	    private double euros = 1.95583;
	    private double japaneseYen = 0.0160012;
	    private double gambianDalasis = 0.041;
	    private double usDollars = 1.8336;
	    private double canadianDollars = 1.38036;
		private double australianDollars = 1.38584;

	    public CurrencyConverterGBP()                       //constructor
	    {
	        super();
	        this.setSize(400, 300);                         //set size of the window
	        this.setLayout(new GridLayout(3, 1));           //split the grid with panels
	        this.setTitle("Currency Converter");     //set window title
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This will close the window

	        

	        this.selectLabel = new JLabel("Select a currency to convert to: ", JLabel.RIGHT);

	        this.resultLabel = new JLabel(" ", JLabel.CENTER);

	        this.currencyMenu = new JMenu("(Choose currency)");        //create a menu of currencies

	        JMenuItem Euros = new JMenuItem("Euros");                       //store the string Euros as a menu item
	        Euros.addActionListener(new java.awt.event.ActionListener()     //add a listener to this item
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt) //listen for event
	            {
	                menuChanged(evt);
	            }
	        });
	        this.currencyMenu.add(Euros);

	        JMenuItem JapaneseYen = new JMenuItem("Japanese Yen");          //store the string Japanese Yen as a menu item
	        JapaneseYen.addActionListener(new java.awt.event.ActionListener()   //add a listener to this item
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt)
	            {
	                menuChanged(evt);
	            }
	        });
	        this.currencyMenu.add(JapaneseYen);

	        
	        JMenuItem GambianDalasis = new JMenuItem("Gambian Dalasis");           //store the string russian rubles as a menu item
	        GambianDalasis.addActionListener(new java.awt.event.ActionListener()    //add a listener to this item
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt)
	            {
	                menuChanged(evt);
	            }
	        });
	        this.currencyMenu.add(GambianDalasis);
	        
	        
	        JMenuItem CD = new JMenuItem("Canadian Dollars");          //store the string Canadian Dollars as a menu item
	        CD.addActionListener(new java.awt.event.ActionListener()   //add a listener to this item
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt)
	            {
	                menuChanged(evt);
	            }
	        });
	        this.currencyMenu.add(CD);

	        
	        JMenuItem USD = new JMenuItem("US Dollars");                    //store the string US Dollars as a menu item
	        USD.addActionListener(new java.awt.event.ActionListener()       //add a listener to this item
	        {
	            public void actionPerformed(java.awt.event.ActionEvent evt)
	            {
	                menuChanged(evt);
	            }
	        });
	        this.currencyMenu.add(USD);


	        currencyMenuBar = new JMenuBar();               //initialise a new menubar and add it to the currency menu
	        currencyMenuBar.add(currencyMenu);

	        this.menuPanel = new JPanel();
	        this.menuPanel.add(this.selectLabel);
	        this.menuPanel.add(this.currencyMenuBar);
	        this.add(this.menuPanel);

	        this.promptLabel = new JLabel("(Enter value in BGN) ", JLabel.RIGHT);
	        this.resultLabel = new JLabel(" ", JLabel.CENTER);

	        this.inputField = new JTextField("", 12);
	        //this.amountField.setEditable(false); //need help with this part


	        this.convertButton = new JButton("Click Me");
	        convertButton.addActionListener(new java.awt.event.ActionListener()
	        {

	            public void actionPerformed(java.awt.event.ActionEvent evt)
	            {
	                buttonclicked(evt);
	            }
	        });

	        this.inputPanel = new JPanel();
	        this.inputPanel.add(this.promptLabel);
	        this.inputPanel.add(this.inputField);
	        this.inputPanel.add(this.convertButton);
	        

	        this.add(this.inputPanel);

	        this.resultPanel = new JPanel();
	        this.resultPanel.add(this.resultLabel);
	        this.add(this.resultPanel);
	    }

	    /*
	     * change the state of the menu bar depending on the selected currency
	     */
	    public void menuChanged(ActionEvent e)
	    {
	        if (e.getActionCommand().equals("Euros"))
	        {
	            currencyMenu.setText("Euros");
	        }
	        if (e.getActionCommand().equals("Japanese Yen")) {
	            currencyMenu.setText("Japanese Yen");
	        }

	        if (e.getActionCommand().equals("Gambian Dalasis")) {
	            currencyMenu.setText("Gambian Dalasis");
	        }
	        if (e.getActionCommand().equals("Australian Dollars")) {
	            currencyMenu.setText("Australian Dollars");
	        }
	        
	        if (e.getActionCommand().equals("Canadian Dollars")) {
	            currencyMenu.setText("Canadian Dollars");
	        }

	        if (e.getActionCommand().equals("US Dollars")) {
	            currencyMenu.setText("US Dollars");
	        }

	    }

	    /*
	     * Events listeners for goButton
	     * when the goButton is clicked it should return the user's initial value
	     * plus the converted amount and some predefined strings.
	     */
	    public void buttonclicked(ActionEvent evt)
	    {
	        if(currencyMenu.getText().equals("Euros"))
	        {
	            resultLabel.setText(inputField.getText() + " in bulgarian levs " + EurosToBGN() + " Euros.");
	        }
	        
	        
	        if(currencyMenu.getText().equals("Japanese Yen"))
	        {
	            resultLabel.setText(inputField.getText() + " in bulgarian levs " + JapaneseYenToBGN() + " Japanese Yen.");
	        }
	        
	        
	        if(currencyMenu.getText().equals("Gambia Dalasis"))
	        {
	            resultLabel.setText(inputField.getText() + " in bulgarian levs " + GambianDalasisToBGN() + "Gambian Dalasis.");
	        }
	        
	        
	        
	        if(currencyMenu.getText().equals("Australian Dollars"))
	        {
	            resultLabel.setText(inputField.getText() + " in bulgarian levs " + AustralianDollarsToBGN() + " Australian Dollars.");
	        }
	        
	        
	        if(currencyMenu.getText().equals("Canadian Dollars"))
	        {
	            resultLabel.setText(inputField.getText() + " in bulgarian levs " + CanadianDollarsToBGN() + " Canadian Dollars.");
	        }
	        
	        
	        if(currencyMenu.getText().equals("US Dollars"))
	        {
	            resultLabel.setText(inputField.getText() + " in bulgarian levs " + USDollarsToBGN() + " US Dollars.");
	        }
	    }

	    /*
	     * Functions for converting currencies
	     * get the user entry from inputField, convert it to a
	     * double and multiply it by the rate of a particular
	     * currency to a BGN.
	     */

	   
		private String CanadianDollarsToBGN() {
			// TODO Auto-generated method stub
			return null;
		}

		private String AustralianDollarsToBGN() {
			// TODO Auto-generated method stub
			return null;
		}

		@SuppressWarnings("unused")
		private String CanadianDollars() {
			// TODO Auto-generated method stub
			return "";
		}

		//calculate the rate for euros
	    double EurosToBGN()
	    {
	        double calcTotal = Double.parseDouble(inputField.getText()) / euros;
	        return calcTotal;
	    }
	    //calculate the conversion rate for japanese yen
	    double JapaneseYenToBGN()
	    {
	        double calcTotal = Double.parseDouble(inputField.getText()) / japaneseYen;
	        return calcTotal;
	    }
	    //calculate the rate for russian rubles
	    double GambianDalasisToBGN()
	    {
	        double calcTotal = Double.parseDouble(inputField.getText()) / gambianDalasis;
	        return calcTotal;
	    }
	    //calculate the rate for us dollars
	    double USDollarsToBGN()
	    {
	        double calcTotal = Double.parseDouble(inputField.getText()) / usDollars;
	        return calcTotal;
	    }

	    /*
	     * main method to initialise CurrencyConverterWin
	     */
	    public static void main(String[] args)
	    {
	    	CurrencyConverterGBP CurCon = new CurrencyConverterGBP();
	        CurCon.setVisible(true);
	    }
	    
	    public JButton getclearButton() {
			return clearButton;
		}

		public void seclearButton(JButton convertButton) {
			this.convertButton = convertButton;
		}

	    

		public JButton getConvertButton() {
			return convertButton;
		}

		public void setConvertButton(JButton convertButton) {
			this.convertButton = convertButton;
		}

		public JButton getClearButton() {
			return clearButton;
		}

		public void setClearButton(JButton clearButton) {
			this.clearButton = clearButton;
		}

		public double getCanadianDollars() {
			return canadianDollars;
		}

		public void setCanadianDollars(double canadianDollars) {
			this.canadianDollars = canadianDollars;
		}

		public double getAustralianDollars() {
			return australianDollars;
		}

		
		public void setAustralianDollars(double australianDollars) {
			this.australianDollars = australianDollars;
		}

		
		}

	 


