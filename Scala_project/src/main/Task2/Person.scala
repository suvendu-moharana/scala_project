

case class Person(fistname:String, lastname:String)
  object Person_list extends App{
    val name = List(
      Person("suvendu", "moharana"),
      Person("ajay", "das"),
      Person("biswojit", "sahu"),
      Person("ramesh","behera")
    )
    //store fist name in list
    val f=name.map(_.fistname)

    //store last name in list
    val l=name.map(_.lastname)

    //sorting fist name in asscending order
    val fNameSort=f.sorted

    //sorting last name in asscending order
    val lnameSort=l.sorted

    println("Sorting in order to fist name..\n" +fNameSort)
    println("Sorting in order to last name ...\n"+lnameSort)
  }