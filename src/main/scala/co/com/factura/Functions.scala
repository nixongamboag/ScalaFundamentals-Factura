package co.com.factura

object Functions {

  def addProduct(price:Double, f: (Double, Double) => Double )={
    f(price,_)
  }

  def addImpoConsumo(producto: (Double, Boolean)): Double ={
    val (price, apply) = producto
    if(apply) price*1.16 else price
  }

  def getIva(price:Double) = price*0.19

  def addTaxes(amount:Double, tax:Double) ={
    amount + tax
  }
}
