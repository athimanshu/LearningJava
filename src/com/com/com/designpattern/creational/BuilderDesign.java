package com.com.com.designpattern.creational;

class BankAccount
{
    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    private BankAccount(){}

    public static class BankAccountBuilder
    {
        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        public BankAccountBuilder(String name, String accountNumber)
        {
            this.name=name;
            this.accountNumber=accountNumber;

        }
        public  BankAccountBuilder email(String email)
        {
            this.email = email;
            return this;
        }
        public BankAccountBuilder newsLetter(boolean newsletter)
        {
            this.newsletter= newsletter;
            return this;
        }
        public BankAccount build()
        {
            return new BankAccount();
        }
    }

}
