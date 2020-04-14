
import UtilitiesPackage.IncomeTaxUtilities
import scala.io.StdIn
object IncomeTaxCalculator {

  def main(args: Array[String]): Unit = {

    val util = new IncomeTaxUtilities()

    print("Please enter your fixed income \n(without PF & Graduity from Employer) : ")
    val income : Int = scala.io.StdIn.readInt()

    val old_tax : Double = util.calculateTaxAsPerOldRules(income)
    val new_tax : Double = util.calculateTaxAsPerNewRules(income)

    println("\n****** Monthly Tax Payable *******")
    println("Old rules : "+ (old_tax/12).round)
    println("New rules : "+ (new_tax/12).round)

    println("\n******* In hand Salary *******")
    println("Old rules : "+ (util.getInhandSalary(income,old_tax)).round)
    println("New rules : "+ (util.getInhandSalary(income,new_tax)).round)

  }
}
