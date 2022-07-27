object Test {

  def main(args: Array[String]): Unit = {
    val a: Int = 10
    val b: String = "Abc"
    print("Hello World")
    println("Hello World")

    val per = new Person("Anuj", 40)
    val per1 = new Person("Rishi", 40)

    per.setAge(41)
    println(per.getAge)
    per.print()

    Person.getCountries()
    val dept = new Department(name = "Finance",deptId = "123344",Some("Nirjhar"))
    val dept1 = new Department(name = "HR",deptId = "123567")

    val cp= new CPerson(name = "Anuj", age = 40)

    inspect(dept)
    inspect(dept1)
    inspect(cp)

    def inspect(obj: Inspectable): Unit = obj match {

      case Department(name,deptId,head) => {
        println("Hello Department1, Inspection Is On")
        obj.inspect()
      }
      case CPerson(name,age) => {
        println("Hello Person, Inspection Is On")
        obj.inspect()
      }

    }

  }
}
