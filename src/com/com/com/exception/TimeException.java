package com.com.com.exception;

class TimeException extends Exception {
    private static final long serialVersionId = 541564231;
    private String errorCode = "Too slow exception";

    public TimeException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
    class CheckCustomException
    {
        public static void main(String[] args) {
            System.out.println("Checking custom Exception");
            try {
                throw new TimeException("Exception Caught","007");
            } catch (TimeException e) {
                e.getErrorCode();
                e.printStackTrace();
            }
            System.out.println("After Exception");
        }
    }

