/**
 * Created by mhofsche on 20.10.15.
 */
class Anagram(input: String) {

  def matches(seq: Seq[String]): Seq[String] = {
     seq.filter(word => isAnagram(word))
  }

  def isAnagram(word : String) = {
    word.toLowerCase.sorted == input.toLowerCase.sorted && word.toLowerCase != input.toLowerCase
  }

}
