/** 
  *  True if the string with all spaces and punctuation removed is a palindrome
  *  
  *  Hint: the Scala collections API is your friend
  *  https://docs.scala-lang.org/overviews/scala-book/collections-methods.html
  */
def isPalindrome(s: String): Boolean = 
  val cleanedString = s.filter(c => c.isLetter).toLowerCase
  cleanedString == cleanedString.reverse

