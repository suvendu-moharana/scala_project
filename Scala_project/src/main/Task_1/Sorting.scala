

object Sorting extends App {
//sorting by fist name
  val names:List[String]=List("suvendu moharana","abinash shau","tapan ojha","chinmay jena","rajat senapati")
  val result =names.sorted
  println("sorting by fist name...... ")
  for(r <- result){
    println(r)
  }

//sorting by last name
  val result1=names.sortBy(name => name.split(" ")(1))
  println("sorting by last name....")
  for (r1 <- result1){
    println(r1)
  }
}
