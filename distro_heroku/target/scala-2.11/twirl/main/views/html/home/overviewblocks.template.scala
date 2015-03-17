
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
<div class="row" style="padding=10px">
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
            <a href="#">
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
                        <div class="huge">0</div>
                        <div> Calendar</div>
                    </div>
                </div>
            </div>
            <a href="#">
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
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/home/overviewblocks.scala.html
                  HASH: 2b7ef2b1af3d12b186f0d283747e6c8c34944438
                  MATRIX: 735->1|834->12|861->13|1314->439|1330->446|1430->524|2290->1357|2309->1367|2356->1393|2526->1536|2541->1542|2584->1564|3297->2250|3310->2254|3398->2320|3566->2461|3581->2467|3621->2486
                  LINES: 26->1|29->1|30->2|40->12|40->12|40->12|62->34|62->34|62->34|67->39|67->39|67->39|84->56|84->56|84->56|89->61|89->61|89->61
                  -- GENERATED --
              */
          