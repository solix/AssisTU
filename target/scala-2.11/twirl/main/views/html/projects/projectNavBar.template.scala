
package views.html.projects

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object projectNavBar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: Person, project: Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*2.1*/("""<div class="container-fluid" style="text-align: center; margin: 1% 0">
    <div role="tabpanel">
        <ul class="nav nav-tabs">
            """),_display_(/*5.14*/for(p <- PersonData.findActiveProjects) yield /*5.53*/ {_display_(Seq[Any](format.raw/*5.55*/("""
                """),format.raw/*6.17*/("""<li role="presentation" """),_display_(/*6.42*/if(p.id == project.id)/*6.64*/{_display_(Seq[Any](format.raw/*6.65*/("""class="active"""")))}),format.raw/*6.80*/(""" """),format.raw/*6.81*/("""style="width: 18%; text-overflow : ellipsis ; overflow : hidden ; white-space : nowrap">
                    <a href="#project"""),_display_(/*7.39*/p/*7.40*/.id),format.raw/*7.43*/("""" data-toggle="tab">"""),_display_(/*7.64*/p/*7.65*/.folder),format.raw/*7.72*/("""</a>
                </li>
            """)))}),format.raw/*9.14*/("""
        """),format.raw/*10.9*/("""</ul>
    </div>
</div>
"""))}
  }

  def render(currentUser:Person,project:Project): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,project)

  def f:((Person,Project) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,project) => apply(currentUser,project)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/projects/projectNavBar.scala.html
                  HASH: 57e39c1d9332b31c3701166771745be316d1b9e7
                  MATRIX: 748->1|875->40|902->41|1072->185|1126->224|1165->226|1209->243|1260->268|1290->290|1328->291|1373->306|1401->307|1554->434|1563->435|1586->438|1633->459|1642->460|1669->467|1739->507|1775->516
                  LINES: 26->1|29->1|30->2|33->5|33->5|33->5|34->6|34->6|34->6|34->6|34->6|34->6|35->7|35->7|35->7|35->7|35->7|35->7|37->9|38->10
                  -- GENERATED --
              */
          