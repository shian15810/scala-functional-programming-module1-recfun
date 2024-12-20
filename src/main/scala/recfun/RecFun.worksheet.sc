import recfun.RecFun

RecFun.pascal(0, 0)
RecFun.pascal(0, 1)
RecFun.pascal(1, 1)
RecFun.pascal(0, 2)
RecFun.pascal(1, 2)
RecFun.pascal(2, 2)
RecFun.pascal(0, 3)
RecFun.pascal(1, 3)
RecFun.pascal(2, 3)
RecFun.pascal(3, 3)
RecFun.pascal(0, 4)
RecFun.pascal(1, 4)
RecFun.pascal(2, 4)
RecFun.pascal(3, 4)
RecFun.pascal(4, 4)

RecFun.balance("(if (zero? x) max (/ 1 x))".toList)
RecFun.balance("I told him (that it's not (yet) done). (But he wasn't listening)".toList)
RecFun.balance(":-)".toList)
RecFun.balance("())(".toList)

RecFun.countChange(4,List(1,2)) // 3
RecFun.countChange(300,List(5,10,20,50,100,200,500)) // 1022
RecFun.countChange(301,List(5,10,20,50,100,200,500)) // 0
RecFun.countChange(300,List(500,5,50,100,20,200,10)) // 1022
