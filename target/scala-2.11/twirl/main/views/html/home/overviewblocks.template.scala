
package views.html.home

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
object overviewblocks extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(uid: Long):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.13*/("""
"""),format.raw/*2.1*/("""<!-- /.row -->
<div class="row" id="two" style="padding=10px">
    <div class="col-xs-6 ">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <div class="row">
                    <div class="col-xs-3">
                        <i class="fa fa-comments fa-4x"></i>
                    </div>
                    <div class="col-xs-9 text-right">
                        <div class="huge">"""),_display_(/*12.44*/Comment/*12.51*/.find.where().in("project", PersonData.findActiveProjects()).findList().size()),format.raw/*12.129*/("""</div>
                        <div> Comments!</div>
                    </div>
                </div>
            </div>
            <a href=""""),_display_(/*17.23*/routes/*17.29*/.Application.discussion()),format.raw/*17.54*/("""">
                <div class="panel-footer">
                    <span class="pull-left">View more</span>
                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                    <div class="clearfix"></div>
                </div>
            </a>
        </div>
    </div>
    <div class="col-xs-6 ">
        <div class="panel panel-pink">
            <div class="panel-heading">
                <div class="row">
                    <div class="col-xs-3">
                        <i class="fa fa fa-line-chart fa-4x"></i>
                    </div>
                    <div class="col-xs-9 text-right">
                        <div class="huge">"""),_display_(/*34.44*/PersonData/*34.54*/.findActiveProjects.size()),format.raw/*34.80*/("""</div>
                        <div> Projects</div>
                    </div>
                </div>
            </div>
            <a href=""""),_display_(/*39.23*/routes/*39.29*/.Application.project()),format.raw/*39.51*/("""">
                <div class="panel-footer">
                    <span class="pull-left">View Details</span>
                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                    <div class="clearfix"></div>
                </div>
            </a>
        </div>
    </div>
    <div class="col-xs-6 ">
        <div class="panel panel-green">
            <div class="panel-heading">
                <div class="row">
                    <div class="col-xs-3">
                        <i class="fa fa-wrench fa-4x"></i>
                    </div>
                    <div class="col-xs-9 text-right">
                        <div class="huge">"""),_display_(/*56.44*/Task/*56.48*/.find.where().eq("person", Person.find.ref(uid)).findList().size()),format.raw/*56.114*/("""</div>
                        <div> Tasks!</div>
                    </div>
                </div>
            </div>
            <a href=""""),_display_(/*61.23*/routes/*61.29*/.Application.task()),format.raw/*61.48*/("""">
                <div class="panel-footer">
                    <span class="pull-left">View more</span>
                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                    <div class="clearfix"></div>
                </div>
            </a>
        </div>
    </div>
    <div class="col-xs-6 ">
        <div class="panel panel-yellow">
            <div class="panel-heading">
                <div class="row">
                    <div class="col-xs-3">
                        <i class="fa fa-calendar fa-4x"></i>
                    </div>
                    <div class="col-xs-9 text-right">
                        <div class="huge">"""),_display_(/*78.44*/Event/*78.49*/.find.where().eq("person", Person.find.ref(uid)).findList().size()),format.raw/*78.115*/("""</div>
                        <div> Calendar</div>
                    </div>
                </div>
            </div>
            <a href=""""),_display_(/*83.23*/routes/*83.29*/.CalendarData.calendar()),format.raw/*83.53*/("""">
                <div class="panel-footer">
                    <span class="pull-left">View Details</span>
                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                    <div class="clearfix"></div>
                </div>
            </a>
        </div>
    </div>
</div>"""))}
  }

  def render(uid:Long): play.twirl.api.HtmlFormat.Appendable = apply(uid)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (uid) => apply(uid)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/home/overviewblocks.scala.html
                  HASH: 4c02034377a91686a84eb6a690ce2ac146fdff8c
                  MATRIX: 735->1|834->12|861->13|1323->448|1339->455|1439->533|1610->677|1625->683|1671->708|2387->1397|2406->1407|2453->1433|2623->1576|2638->1582|2681->1604|3394->2290|3407->2294|3495->2360|3663->2501|3678->2507|3718->2526|4431->3212|4445->3217|4533->3283|4703->3426|4718->3432|4763->3456
                  LINES: 26->1|29->1|30->2|40->12|40->12|40->12|45->17|45->17|45->17|62->34|62->34|62->34|67->39|67->39|67->39|84->56|84->56|84->56|89->61|89->61|89->61|106->78|106->78|106->78|111->83|111->83|111->83
                  -- GENERATED --
              */
          