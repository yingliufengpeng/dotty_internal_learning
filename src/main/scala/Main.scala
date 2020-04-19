import dotty.tools.dotc.core.Contexts.{ContextBase, Context, FreshContext}
import dotty.tools.dotc.parsing.Parsers
import dotty.tools.dotc.util.SourceFile
import dotty.tools.io.VirtualFile
object Main {

  def main(args: Array[String]): Unit = {
    
    val contextBase = ContextBase()
    
    given context as Context = contextBase.initialCtx
    
    val text =
      s"""
         |val r = 30
         |println(r)
         |""".stripMargin
    
    val file = CustomSourceFile.virtual("kk.scala", text)
    val parsered = Parsers.parser(file)
    
    println(s"parsered file is $parsered")
    
  }

 

}
