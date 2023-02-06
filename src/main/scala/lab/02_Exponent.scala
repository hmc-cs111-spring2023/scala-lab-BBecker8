
/** 
  * Computes n^e
  */
def expt(n: Int, e: Int): Int = 
  if e == 0 then 1
  else if n == 0 then 0
  else n * expt(n, e - 1)
  
