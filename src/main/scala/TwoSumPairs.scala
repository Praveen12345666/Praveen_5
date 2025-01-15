object TwoSumPairs{
  def findPairs(nums: Array[Int], target: Int): Unit = {
    val seen = scala.collection.mutable.Set[Int]()
    println(s"Pairs with sum $target:")

    for (num <- nums) {
      val complement = target - num
      if (seen.contains(complement)) {
        println(s"($complement, $num)")
      }
      seen.add(num)
    }
  }

  def main(args: Array[String]): Unit = {
    val numbers = Array(10, 20, 30, 40, 50, 60)
    findPairs(numbers, 100)
  }
}
