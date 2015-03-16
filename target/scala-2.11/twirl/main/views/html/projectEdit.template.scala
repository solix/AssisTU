
package views.html

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
object projectEdit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,Project,Form[Project],Boolean,String,String,Person,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, p: Project, projectForm: Form[Project])(info: Boolean, theme: String, message: String)(currentUser:Person):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.124*/("""
    """),_display_(/*2.6*/defining(Project.find.where().in("users", currentUser))/*2.61*/ { projectListQuery =>_display_(Seq[Any](format.raw/*2.83*/("""
        """),format.raw/*3.9*/("""<html lang="en">
            <head>
                """),_display_(/*5.18*/linkLoader/*5.28*/.headlinks(title)),format.raw/*5.45*/("""
            """),format.raw/*6.13*/("""</head>
            <body>
                <div id="wrapper">
                    """),_display_(/*9.22*/dashboard("project", currentUser)),format.raw/*9.55*/("""
                    """),format.raw/*10.21*/("""<div id="page-wrapper">
                        """),_display_(/*11.26*/template/*11.34*/.headericon("fa fa-line-chart fa-5x")),format.raw/*11.71*/("""
                        """),format.raw/*12.25*/("""<div class="row">
                            <div class="col-xs-12" style="text-align: center; margin: 1% 0">
                                <h3>Edit Project """),_display_(/*14.51*/p/*14.52*/.name),format.raw/*14.57*/("""</h3>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
                                """),_display_(/*19.34*/if(info)/*19.42*/ {_display_(Seq[Any](format.raw/*19.44*/("""
                                    """),_display_(/*20.38*/template/*20.46*/.alert(theme, message)),format.raw/*20.68*/("""
                                """)))}),format.raw/*21.34*/("""
                                """),_display_(/*22.34*/helper/*22.40*/.form(action = routes.ProjectData.editProject(p.id))/*22.92*/ {_display_(Seq[Any](format.raw/*22.94*/("""
                                    """),format.raw/*23.37*/("""<div class="form-group">
                                        <label class="control-label" for="validate-text">Folder Name</label>
                                        <input autofocus class="form-control input-sm" id="folder" name="folder" value=""""),_display_(/*25.122*/p/*25.123*/.folder),format.raw/*25.130*/("""" type="text" placeholder="Folder name (Required)">
                                        <span class="help-inline" style="font-size: x-small;">Minimum length: 3</span>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label" for="validate-text">Project Name</label>
                                        <input autofocus class="form-control input-sm" id="name" name="name" value=""""),_display_(/*30.118*/p/*30.119*/.name),format.raw/*30.124*/("""" type="text" placeholder="Project name (Required)">
                                        <span class="help-inline" style="font-size: x-small;">Minimum length: 3</span>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label" for="validate-text">Description</label>
                                        <input autofocus class="form-control input-sm" id="description" name="description" value=""""),_display_(/*35.132*/p/*35.133*/.description),format.raw/*35.145*/("""" type="text" placeholder="Description (Optional)">
                                    </div>
                                    """),_display_(/*37.38*/if(p.template.equals("None"))/*37.67*/ {_display_(Seq[Any](format.raw/*37.69*/("""
                                        """),format.raw/*38.41*/("""<div class="form-group">
                                            <label>Change template: </label>
                                            <select class="form-control" id="template" name="template">
                                                <option>None</option>
                                                <option>TU Delft - Dissertation</option>
                                                <option>TU Delft - Article</option>
                                            </select>
                                        </div>
                                    """)))}/*46.38*/else/*46.43*/{_display_(Seq[Any](format.raw/*46.44*/("""
                                        """),format.raw/*47.41*/("""<label>Chosen template: """),_display_(/*47.66*/p/*47.67*/.template),format.raw/*47.76*/("""</label>
                                        <input type="hidden" name="template" value=""""),_display_(/*48.86*/projectForm("template")/*48.109*/.value),format.raw/*48.115*/("""">
                                    """)))}),format.raw/*49.38*/("""

                                    """),format.raw/*51.37*/("""<div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                                        <a type="button" class="btn btn-default col-xs-12" href=""""),_display_(/*52.99*/routes/*52.105*/.Application.project()),format.raw/*52.127*/("""">Cancel</a>
                                    </div>
                                    <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                                        <button type="submit" class="btn btn-info col-xs-12">Edit!</button>
                                    </div>
                                """)))}),format.raw/*57.34*/("""
                            """),format.raw/*58.29*/("""</div>
                        </div>
                    </div>
                </div>

                    <!-- jQuery -->
                <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>

                    <!-- Form Validation Icons -->
                <script src=""""),_display_(/*67.31*/routes/*67.37*/.Assets.at("javascripts/formValidationSetup.js")),format.raw/*67.85*/(""""></script>

                    <!--bootstrap-->
                <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

                    <!--sb-Admin-->
                <script src=""""),_display_(/*73.31*/routes/*73.37*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*73.76*/(""""></script>
                <script src=""""),_display_(/*74.31*/routes/*74.37*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*74.97*/(""""></script>
            </body>
        </html>
    """)))}))}
  }

  def render(title:String,p:Project,projectForm:Form[Project],info:Boolean,theme:String,message:String,currentUser:Person): play.twirl.api.HtmlFormat.Appendable = apply(title,p,projectForm)(info,theme,message)(currentUser)

  def f:((String,Project,Form[Project]) => (Boolean,String,String) => (Person) => play.twirl.api.HtmlFormat.Appendable) = (title,p,projectForm) => (info,theme,message) => (currentUser) => apply(title,p,projectForm)(info,theme,message)(currentUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/projectEdit.scala.html
                  HASH: 94b7af110a9f90dc9f5378b24fe28fed22e29723
                  MATRIX: 780->1|991->123|1022->129|1085->184|1144->206|1179->215|1258->268|1276->278|1313->295|1353->308|1462->391|1515->424|1564->445|1640->494|1657->502|1715->539|1768->564|1956->725|1966->726|1992->731|2258->970|2275->978|2315->980|2380->1018|2397->1026|2440->1048|2505->1082|2566->1116|2581->1122|2642->1174|2682->1176|2747->1213|3030->1468|3041->1469|3070->1476|3600->1978|3611->1979|3638->1984|4182->2500|4193->2501|4227->2513|4386->2645|4424->2674|4464->2676|4533->2717|5139->3304|5152->3309|5191->3310|5260->3351|5312->3376|5322->3377|5352->3386|5473->3480|5506->3503|5534->3509|5605->3549|5671->3587|5874->3763|5890->3769|5934->3791|6319->4145|6376->4174|6710->4481|6725->4487|6794->4535|7040->4754|7055->4760|7115->4799|7184->4841|7199->4847|7280->4907
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|33->5|33->5|33->5|34->6|37->9|37->9|38->10|39->11|39->11|39->11|40->12|42->14|42->14|42->14|47->19|47->19|47->19|48->20|48->20|48->20|49->21|50->22|50->22|50->22|50->22|51->23|53->25|53->25|53->25|58->30|58->30|58->30|63->35|63->35|63->35|65->37|65->37|65->37|66->38|74->46|74->46|74->46|75->47|75->47|75->47|75->47|76->48|76->48|76->48|77->49|79->51|80->52|80->52|80->52|85->57|86->58|95->67|95->67|95->67|101->73|101->73|101->73|102->74|102->74|102->74
                  -- GENERATED --
              */
          