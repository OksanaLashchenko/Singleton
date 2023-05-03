package company;

public class Main {

    public static void main(String[] args) {
        DataBaseConnection connection1 = new PostgreSQLConnection();
        DataBaseConnection connection2 = new MongoDBConnection();

        System.out.println("Print instances 1");
        ConnectionUtil connectionUtil1 = ConnectionUtil.getInstance(connection1);
        ConnectionUtil connectionUtil2 = ConnectionUtil.getInstance(connection2);
        System.out.println(connection1);
        System.out.println(connectionUtil1);
        System.out.println(connection2);
        System.out.println(connectionUtil2);

        System.out.println("Print instances 2");
        ConnectionUtil connectionUtil3 = ConnectionUtil.getInstance(connection1);
        ConnectionUtil connectionUtil4 = ConnectionUtil.getInstance(connection2);
        System.out.println(connectionUtil3);
        System.out.println(connectionUtil4);
    }

}
