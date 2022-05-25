package co.com.factura

object Functions {

  def addProduct(precio:Double, f: (Double, Double) => Double )={
    f(precio,_)
  }

  def addImpoConsumo(producto: (Double, Boolean)): Double ={
    val (price, apply) = producto
    if(apply) price*1.16 else price
  }

  def getIva(precio:Double) = precio*0.19

  def addTaxes(amount:Double, tax:Double) ={
    amount + tax
  }
}
