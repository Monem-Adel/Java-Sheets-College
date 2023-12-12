
package sheet_2.Question_4;

public class Invoice {
    //--- Data member ---
    private  int ID;
    private String description;
    private int Q_of_item;
    private double price_item;
    static private int invoices_count;
    
    // --- methods ---
    
    //empty constructor
    public Invoice() {
        this.ID = 0;
        this.description = "";
        this.Q_of_item = 0;
        this.price_item = 0;
        invoices_count++;
    }
    
    //parametrised constructor
    public Invoice(int ID, String description, int Q_of_item, double price_item) {
        this.ID = ID;
        this.description = description;
        this.Q_of_item = Q_of_item;
        this.price_item = price_item;
        invoices_count++;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQ_of_item(int Q_of_item) {
        if(Q_of_item < 0)
            this.Q_of_item = 0;
        else
            this.Q_of_item = Q_of_item;
    }

    public void setPrice_item(double price_item) {
        if(price_item < 0)
            this.price_item = 0;
        else
            this.price_item = price_item;
    }

    public static void setInvoices_count(int invoices_count) {
        Invoice.invoices_count = invoices_count;
    }

    public int getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }

    public int getQ_of_item() {
        return Q_of_item;
    }

    public double getPrice_item() {
        return price_item;
    }

    public static int getInvoices_count() {
        return invoices_count;
    }
    
    //subtotal (invoice without tax)
    public double subtotal(){
        return Q_of_item*price_item;
    }
    
    //total (invoice with tax)
    public double total(){
        return this.subtotal()+(0.05*subtotal());
    }
    
    //displaying data of invoice
    public void display(){
        System.out.println("--- Invoice Information ---");
        System.out.println("\t ID : "+getID());
        System.out.println("\t Description : "+getDescription());
        System.out.println("\t Quantity of item : "+getQ_of_item());
        System.out.println("\t Price per item : "+getPrice_item());
        System.out.println("\t Number of Invoices : "+getInvoices_count());
        System.out.println("\t subtotal payment : "+subtotal());
        System.out.println("\t total payment after adding tax : "+total());
    }
        
    //extra method
    @Override
    public String toString() {
        return "Invoice{" + "ID=" + ID + ",\n"
                + " description=" + description + ",\n"
                + " Q_of_item=" + Q_of_item + ",\n"
                + " price_item=" + price_item + '}';
    }
    
    //static class cashier
    static public class Cashier {
        private String cashierName;
        
        public Cashier(){
            cashierName="";
            invoices_count=0;
        }

        public Cashier(String cashierName) {
            this.cashierName = cashierName;
            invoices_count=0;
        }

        public void setCashierName(String cashierName) {
            this.cashierName = cashierName;
        }

        public String getCashierName() {
            return cashierName;
        }
        
        //getInvoices method to get the number of invoices issued by that cashier
        public int getInvoices(){
            return getInvoices_count();
        }
        
        @Override
        public String toString(){
            return ("Cashier : "+getCashierName());
        }
    }
}

