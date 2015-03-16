
package views.html.discussions

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
object discussionContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Person,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: Person):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""
"""),_display_(/*2.2*/defining(Project.find.where().in("users", currentUser).eq("active", "true").findList())/*2.89*/ { activeProjectList =>_display_(Seq[Any](format.raw/*2.112*/("""
    """),format.raw/*3.5*/("""<div class="tab-content">
    """),_display_(/*4.6*/for(p <- activeProjectList) yield /*4.33*/{_display_(Seq[Any](format.raw/*4.34*/("""
        """),_display_(/*5.10*/if(p.equals(activeProjectList.last))/*5.46*/{_display_(Seq[Any](format.raw/*5.47*/("""
            """),format.raw/*6.13*/("""<div class="tab-pane fade in active" id="discussion"""),_display_(/*6.65*/p/*6.66*/.id),format.raw/*6.69*/("""">
            """)))}/*7.15*/else/*7.20*/{_display_(Seq[Any](format.raw/*7.21*/("""
            """),format.raw/*8.13*/("""<div class="tab-pane fade" id="discussion"""),_display_(/*8.55*/p/*8.56*/.id),format.raw/*8.59*/("""">
            """)))}),format.raw/*9.14*/("""
                """),format.raw/*10.17*/("""<div class="container-fluid" style="margin-top: 10px">
                    <div ng-app="sseChat">
                        <div ng-controller="ChatCtrl">
                            <div id="chat" style="background-color: white">
                                <div class=""""),format.raw/*14.45*/("""{"""),format.raw/*14.46*/("""{"""),format.raw/*14.47*/("""msg.who"""),format.raw/*14.54*/("""}"""),format.raw/*14.55*/("""}"""),format.raw/*14.56*/(""" """),format.raw/*14.57*/("""msg" ng-repeat="msg in msgs | limitTo:-4" style="background-color: cornflowerblue">
                                    <p style="margin: 0; padding: 0">"""),format.raw/*15.70*/("""{"""),format.raw/*15.71*/("""{"""),format.raw/*15.72*/("""msg.time"""),format.raw/*15.80*/("""}"""),format.raw/*15.81*/("""}"""),format.raw/*15.82*/("""</p><br/>
                                    <strong>"""),format.raw/*16.45*/("""{"""),format.raw/*16.46*/("""{"""),format.raw/*16.47*/("""msg.user"""),format.raw/*16.55*/("""}"""),format.raw/*16.56*/("""}"""),format.raw/*16.57*/(""" """),format.raw/*16.58*/("""says: </strong>"""),format.raw/*16.73*/("""{"""),format.raw/*16.74*/("""{"""),format.raw/*16.75*/("""msg.text"""),format.raw/*16.83*/("""}"""),format.raw/*16.84*/("""}"""),format.raw/*16.85*/("""<br/>
                                </div>
                            </div>

                            <div id="footer">
                                <form ng-submit="submitMsg()">
                                    <input type="text" name="chat" id="textField" ng-model="inputText"
                                    placeholder="Comment..." class="ng-pristine ng-valid input-block-level" />
                                    <input ng-bind="user='"""),_display_(/*24.60*/currentUser/*24.71*/.name),format.raw/*24.76*/("""'" type="button" class="btn btn-primary" id="saySomething" value="Submit" ng-click="submitMsg()" />
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        """)))}),format.raw/*31.10*/("""
    """),format.raw/*32.5*/("""</div>
""")))}))}
  }

  def render(currentUser:Person): play.twirl.api.HtmlFormat.Appendable = apply(currentUser)

  def f:((Person) => play.twirl.api.HtmlFormat.Appendable) = (currentUser) => apply(currentUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/discussions/discussionContent.scala.html
                  HASH: dfc762ecb0e08eaebe848fd549b00fb8755bd34d
                  MATRIX: 747->1|856->22|883->24|978->111|1039->134|1070->139|1126->170|1168->197|1206->198|1242->208|1286->244|1324->245|1364->258|1442->310|1451->311|1474->314|1508->331|1520->336|1558->337|1598->350|1666->392|1675->393|1698->396|1744->412|1789->429|2090->702|2119->703|2148->704|2183->711|2212->712|2241->713|2270->714|2451->867|2480->868|2509->869|2545->877|2574->878|2603->879|2685->933|2714->934|2743->935|2779->943|2808->944|2837->945|2866->946|2909->961|2938->962|2967->963|3003->971|3032->972|3061->973|3551->1436|3571->1447|3597->1452|3912->1736|3944->1741
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|36->8|37->9|38->10|42->14|42->14|42->14|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|52->24|52->24|52->24|59->31|60->32
                  -- GENERATED --
              */
          