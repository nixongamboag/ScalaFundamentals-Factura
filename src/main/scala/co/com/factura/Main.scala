package co.com.factura

object Main {

  def main(arg:Array[String]) ={
    println("Bienvenido a SofkaShop")

    val productList = List((100D,true),(200D,false),(50D,false),(263D,true))
    println("Tu compra es de "+ productList.length +" productos")

    val unitValues = productList.map(product => Functions.addImpoConsumo(product))

    val totalGross = unitValues.reduce((total,valUnit)=> Functions.addProduct(valUnit, (a, b)=> a+b)(total))
    println("Total bruto: $" + totalGross)

    val iva = Functions.getIva(totalGross)
    println("IVA: $"+iva)

    val generalValue = Functions.addTaxes(totalGross,iva)
    println("Total General: $"+ generalValue)
  }
}
