
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
object projectNew extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,Form[Project],Boolean,String,String,Person,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, projectForm: Form[Project])(info: Boolean, theme: String, message: String)(currentUser:Person):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.112*/("""
"""),_display_(/*2.2*/defining(Project.find.where().in("users", currentUser))/*2.57*/ { projectListQuery =>_display_(Seq[Any](format.raw/*2.79*/("""
    """),format.raw/*3.5*/("""<html lang="en">
        <head>
            """),_display_(/*5.14*/linkLoader/*5.24*/.headlinks(title)),format.raw/*5.41*/("""
        """),format.raw/*6.9*/("""</head>
        <body>
            <div id="wrapper">
                """),_display_(/*9.18*/dashboard("project", currentUser)),format.raw/*9.51*/("""
                """),format.raw/*10.17*/("""<div id="page-wrapper">
                    """),_display_(/*11.22*/template/*11.30*/.headericon("fa fa-line-chart fa-5x")),format.raw/*11.67*/("""
                    """),format.raw/*12.21*/("""<div class="row">
                        <div class="col-xs-12" style="text-align: center; margin: 1% 0">
                            <h3>Create a new Project</h3>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
                            """),_display_(/*19.30*/if(info)/*19.38*/ {_display_(Seq[Any](format.raw/*19.40*/("""
                                """),_display_(/*20.34*/template/*20.42*/.alert(theme, message)),format.raw/*20.64*/("""
                            """)))}),format.raw/*21.30*/("""
                            """),_display_(/*22.30*/helper/*22.36*/.form(action = routes.ProjectData.createProject())/*22.86*/ {_display_(Seq[Any](format.raw/*22.88*/("""
                                """),format.raw/*23.33*/("""<div class="form-group">
                                    <label class="control-label" for="validate-text">Folder Name</label>
                                    <input autofocus class="form-control input-sm" id="folder" name="folder" value=""""),_display_(/*25.118*/projectForm("folder")/*25.139*/.value),format.raw/*25.145*/("""" type="text" placeholder="Folder name (Required)">
                                    <span class="help-inline" style="font-size: x-small;">Minimum length: 3</span>
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="validate-text">Project Name</label>
                                    <input autofocus class="form-control input-sm" id="name" name="name" value=""""),_display_(/*30.114*/projectForm("name")/*30.133*/.value),format.raw/*30.139*/("""" type="text" placeholder="Project name (Required)">
                                    <span class="help-inline" style="font-size: x-small;">Minimum length: 3</span>
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="validate-text">Description</label>
                                    <input autofocus class="form-control input-sm" id="description" name="description" value=""""),_display_(/*35.128*/projectForm("description")/*35.154*/.value),format.raw/*35.160*/("""" type="text" placeholder="Description (Optional)">
                                </div>
                                <div class="form-group">
                                    <label>Choose a template: </label>
                                    <select class="form-control" id="template" name="template">
                                        <option>None</option>
                                        <option>TU Delft - Dissertation</option>
                                        <option>TU Delft - Article</option>
                                    </select>
                                </div>
                                <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                                    <a type="button" class="btn btn-default col-xs-12" href=""""),_display_(/*46.95*/routes/*46.101*/.Application.project()),format.raw/*46.123*/("""">Cancel</a>
                                </div>
                                <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                                    <button type="submit" class="btn btn-success col-xs-12">Create!</button>
                                </div>
                            """)))}),format.raw/*51.30*/("""
                        """),format.raw/*52.25*/("""</div>
                    </div>
                </div>
            </div>

                <!-- jQuery -->
            <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>

                <!-- Form Validation Icons -->
            <script src=""""),_display_(/*61.27*/routes/*61.33*/.Assets.at("javascripts/formValidationSetup.js")),format.raw/*61.81*/(""""></script>

                <!--bootstrap-->
            <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

                <!--sb-Admin-->
            <script src=""""),_display_(/*67.27*/routes/*67.33*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*67.72*/(""""></script>

            <script src=""""),_display_(/*69.27*/routes/*69.33*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*69.93*/(""""></script>

        </body>
    </html>
""")))}))}
  }

  def render(title:String,projectForm:Form[Project],info:Boolean,theme:String,message:String,currentUser:Person): play.twirl.api.HtmlFormat.Appendable = apply(title,projectForm)(info,theme,message)(currentUser)

  def f:((String,Form[Project]) => (Boolean,String,String) => (Person) => play.twirl.api.HtmlFormat.Appendable) = (title,projectForm) => (info,theme,message) => (currentUser) => apply(title,projectForm)(info,theme,message)(currentUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/projectNew.scala.html
                  HASH: 67e9da0f2f55e9d6ccc49fbffe342a7696569866
                  MATRIX: 771->1|970->111|997->113|1060->168|1119->190|1150->195|1221->240|1239->250|1276->267|1311->276|1408->347|1461->380|1506->397|1578->442|1595->450|1653->487|1702->508|2107->886|2124->894|2164->896|2225->930|2242->938|2285->960|2346->990|2403->1020|2418->1026|2477->1076|2517->1078|2578->1111|2853->1358|2884->1379|2912->1385|3422->1867|3451->1886|3479->1892|4003->2388|4039->2414|4067->2420|4917->3243|4933->3249|4977->3271|5347->3610|5400->3635|5706->3914|5721->3920|5790->3968|6020->4171|6035->4177|6095->4216|6161->4255|6176->4261|6257->4321
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|33->5|33->5|33->5|34->6|37->9|37->9|38->10|39->11|39->11|39->11|40->12|47->19|47->19|47->19|48->20|48->20|48->20|49->21|50->22|50->22|50->22|50->22|51->23|53->25|53->25|53->25|58->30|58->30|58->30|63->35|63->35|63->35|74->46|74->46|74->46|79->51|80->52|89->61|89->61|89->61|95->67|95->67|95->67|97->69|97->69|97->69
                  -- GENERATED --
              */
          