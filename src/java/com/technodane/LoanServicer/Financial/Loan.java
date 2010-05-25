package com.technodane.LoanServicer.Financial;


/**
 * Class Loan
 */
public class Loan {

  //
  // Fields
  //

  private double loanAmount;
  private double balance;
  private double interestRate;
  
  //
  // Constructors
  //
  public Loan () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of loanAmount
   * @param newVar the new value of loanAmount
   */
  private void setLoanAmount ( double newVar ) {
    loanAmount = newVar;
  }

  /**
   * Get the value of loanAmount
   * @return the value of loanAmount
   */
  private double getLoanAmount ( ) {
    return loanAmount;
  }

  /**
   * Set the value of balance
   * @param newVar the new value of balance
   */
  private void setBalance ( double newVar ) {
    balance = newVar;
  }

  /**
   * Get the value of balance
   * @return the value of balance
   */
  private double getBalance ( ) {
    return balance;
  }

  /**
   * Set the value of interestRate
   * @param newVar the new value of interestRate
   */
  private void setInterestRate ( double newVar ) {
    interestRate = newVar;
  }

  /**
   * Get the value of interestRate
   * @return the value of interestRate
   */
  private double getInterestRate ( ) {
    return interestRate;
  }

  //
  // Other methods
  //

}
