//Exception Hierarchy
class lec88{
    public static void main(String[] args) {
      for (int iterate = 0; iterate < 10; iterate++) {
       System.out.println("Number"+iterate); 
      }        
    }

}
/*
    Parent class -> object class
    |
    v
    Throwable
        1. Error
            a. Thread Death b. IO Error c. Out of Memory
        2. Exception
            a. Runtime exception b. SQL execption c. IO execption
            a. Runtime
                i. Arithmetic exp
                ii. Arrya index out of bound
                iii. Null POINT exp
            -- These are Unchecked Exception
    
*/
