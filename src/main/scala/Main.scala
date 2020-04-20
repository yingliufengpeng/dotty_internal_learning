import java.nio.file.Path

import dotty.tools.dotc.core.Contexts.{Context, ContextBase, FreshContext}
import dotty.tools.dotc.parsing.Parsers
import dotty.tools.dotc.util.SourceFile
import dotty.tools.io.{Path, PlainFile, VirtualFile}
import dotty.tools.dotc.ast.untpd._ 

object Main {

  def main(args: Array[String]): Unit = {

    val contextBase = ContextBase()

    given context as Context = contextBase.initialCtx


    val path = "D:\\Dotty_repo\\dotty_internals_learning\\src\\main\\scala\\demo.scala"
    val f2 = CustomSourceFile.file(path)
//    val parsered = Parsers.parser(f2).parse()
//
//
//    println(s"parsered file is $parsered")
//    
//    println(s"parsered.show ${parsered.show}")
    
    val parser = Parsers.parser(f2)
    val tree = parser.defOrDcl(0, EmptyModifiers)
    println(s"tree is $tree")
  
  }


}
