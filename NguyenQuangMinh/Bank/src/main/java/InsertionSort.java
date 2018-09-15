import accounts.BankAccount;

public class InsertionSort {
    public static int numberOfAccount;

    public static void sort(BankAccount[] account, MyComparator compare){
        for (int i = 1; i < numberOfAccount; i++) {
            if(!compare.less(account[i - 1], account[i])){
                BankAccount temp = account[i];
                int a = i - 1;
                while (a >= 0){
                    if(compare.less(account[a], temp)) break;
                    account[a + 1] = account[a];
                    --a;
                }
                account[a + 1] = temp;
            }
        }
    }

    public static void print(BankAccount[] accounts){
        for (int i = 0; i < numberOfAccount; ++i){
            System.out.println(accounts[i]);
        }
    }

    public static void main(String[] args) {
        numberOfAccount = 5;
        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new BankAccount(10000);
        accounts[0].deposit(1000);
        accounts[0].withdraw(1000);

        accounts[1] = new BankAccount(11000);
        accounts[1].withdraw(3000);
        accounts[1].withdraw(1000);
        accounts[1].withdraw(1000);

        accounts[2] = new BankAccount(9000);
        accounts[2].deposit(4000);
        accounts[2].withdraw(1000);
        accounts[2].withdraw(1000);
        accounts[2].withdraw(1000);
        accounts[2].withdraw(1000);

        accounts[3] = new BankAccount(15000);
        accounts[3].deposit(1000);
        accounts[3].withdraw(1000);
        accounts[3].deposit(10000);
        accounts[3].withdraw(1000);

        accounts[4] = new BankAccount(20000);
        accounts[4].withdraw(1000);

        BalanceAscending compare1 = new BalanceAscending();
        sort(accounts, compare1);
        print(accounts);

        BalanceDescending compare2 = new BalanceDescending();
        sort(accounts, compare2);
        print(accounts);

        TransactionCountDescending compare3 = new TransactionCountDescending();
        sort(accounts, compare3);
        print(accounts);
    }
}
