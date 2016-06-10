package app.models

import app.models.TicketStatus

/**
  * Created by No51 on 2016/06/05.
  */
trait Ticket {
  //field
  val id: Long
  val title: String
  val status: TicketStatus
}

class Issue(id: TicketId, title: String, status: TicketStatus = TicketStatus.Open) extends Ticket
class Bug(id: TicketId, title: String, description: String, status: TicketStatus = TicketStatus.Open) extends Ticket

//valを付けることでpublicな値になる
//caseをつけるとvalがとれる(publicなフィールドにしてくれる)　いろんなメソッドをnewしないでIssue.applyアプライ
//applyは省略することができる caseをつけると
//caseをつけるとstaticなファクトリを生成することができる
//scalaはstaticはない

//case
//caseクラスをcaseクラスを継承できない
//subクラスでcaseを使う場合caseクラスを使わない(//equlesが一致しなくなるので)