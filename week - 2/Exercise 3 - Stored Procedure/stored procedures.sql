--scenario 1
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE accounts
    SET BALANCE = BALANCE + (BALANCE * 0.01)
    WHERE ACCOUNTTYPE = 'Savings';
    
    COMMIT;
END;
EXEC ProcessMonthlyInterest;

--scenario 2
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  p_department IN VARCHAR2,
  p_bonus_percent IN NUMBER
) IS
BEGIN
  UPDATE EMPLOYEES
  SET SALARY = SALARY + (Salary * p_bonus_percent / 100)
  WHERE DEPARTMENT = p_department;
  COMMIT;
END;
/


EXEC UpdateEmployeeBonus('IT', 10);

--scenario 3

CREATE OR REPLACE PROCEDURE TransferFunds (
  p_from_account IN NUMBER,
  p_to_account IN NUMBER,
  p_amount IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  -- Check if source account has enough balance
  SELECT BALANCE INTO v_balance
  FROM ACCOUNTS
  WHERE ACCOUNTID = p_from_account
  FOR UPDATE;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
  END IF;

  -- Deduct from source
  UPDATE Accounts
  SET BALANCE = BALANCE - p_amount
  WHERE ACCOUNTID = p_from_account;

  -- Add to destination
  UPDATE ACCOUNTS
  SET BALANCE = BALANCE + p_amount
  WHERE ACCOUNTID = p_to_account;

  COMMIT;
END;
/


EXEC TransferFunds(1, 2, 500); 

select * from ACCOUNTS;

