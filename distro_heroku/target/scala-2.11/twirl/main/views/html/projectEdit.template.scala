
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
                            <h3>Edit Project """),_display_(/*14.47*/p/*14.48*/.name),format.raw/*14.53*/("""</h3>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
                            """),_display_(/*19.30*/if(info)/*19.38*/ {_display_(Seq[Any](format.raw/*19.40*/("""
                                """),_display_(/*20.34*/template/*20.42*/.alert(theme, message)),format.raw/*20.64*/("""
                            """)))}),format.raw/*21.30*/("""
                        """),_display_(/*22.26*/helper/*22.32*/.form(action = routes.ProjectData.editProject(p.id))/*22.84*/ {_display_(Seq[Any](format.raw/*22.86*/("""
                            """),format.raw/*23.29*/("""<div class="form-group">
                                <label class="control-label" for="validate-text">Folder Name</label>
                                <input autofocus class="form-control input-sm" id="folder" name="folder" value=""""),_display_(/*25.114*/p/*25.115*/.folder),format.raw/*25.122*/("""" type="text" placeholder="Folder name (Required)">
                                <span class="help-inline" style="font-size: x-small;">Minimum length: 3</span>
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="validate-text">Project Name</label>
                                <input autofocus class="form-control input-sm" id="name" name="name" value=""""),_display_(/*30.110*/p/*30.111*/.name),format.raw/*30.116*/("""" type="text" placeholder="Project name (Required)">
                                <span class="help-inline" style="font-size: x-small;">Minimum length: 3</span>
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="validate-text">Description</label>
                                <input autofocus class="form-control input-sm" id="description" name="description" value=""""),_display_(/*35.124*/p/*35.125*/.description),format.raw/*35.137*/("""" type="text" placeholder="Description (Optional)">
                            </div>
                            <div class="form-group">
                                <label>Chosen template: </label>
                                <select class="form-control" name="template">
                                    <option>"""),_display_(/*40.46*/p/*40.47*/.template),format.raw/*40.56*/("""</option>
                                </select>
                            </div>
                            <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                                <a type="button" class="btn btn-default col-xs-12" href=""""),_display_(/*44.91*/routes/*44.97*/.Application.project()),format.raw/*44.119*/("""">Cancel</a>
                            </div>
                            <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                                <button type="submit" class="btn btn-info col-xs-12">Edit!</button>
                            </div>
                        """)))}),format.raw/*49.26*/("""
                        """),format.raw/*50.25*/("""</div>
                    </div>
                </div>
            </div>

                <!-- jQuery -->
            <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>

                <!-- Form Validation Icons -->
            <script src=""""),_display_(/*59.27*/routes/*59.33*/.Assets.at("javascripts/formValidationSetup.js")),format.raw/*59.81*/(""""></script>

                <!--bootstrap-->
            <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

                <!--sb-Admin-->
            <script src=""""),_display_(/*65.27*/routes/*65.33*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*65.72*/(""""></script>

            <script src=""""),_display_(/*67.27*/routes/*67.33*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*67.93*/(""""></script>

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
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/projectEdit.scala.html
                  HASH: 9628cefdfe9ba2bdd89bb31a699c78f2973150af
                  MATRIX: 780->1|991->123|1018->125|1081->180|1140->202|1171->207|1242->252|1260->262|1297->279|1332->288|1429->359|1482->392|1527->409|1599->454|1616->462|1674->499|1723->520|1903->673|1913->674|1939->679|2185->898|2202->906|2242->908|2303->942|2320->950|2363->972|2424->1002|2477->1028|2492->1034|2553->1086|2593->1088|2650->1117|2917->1356|2928->1357|2957->1364|3447->1826|3458->1827|3485->1832|3989->2308|4000->2309|4034->2321|4389->2649|4399->2650|4429->2659|4739->2942|4754->2948|4798->2970|5143->3284|5196->3309|5502->3588|5517->3594|5586->3642|5816->3845|5831->3851|5891->3890|5957->3929|5972->3935|6053->3995
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|33->5|33->5|33->5|34->6|37->9|37->9|38->10|39->11|39->11|39->11|40->12|42->14|42->14|42->14|47->19|47->19|47->19|48->20|48->20|48->20|49->21|50->22|50->22|50->22|50->22|51->23|53->25|53->25|53->25|58->30|58->30|58->30|63->35|63->35|63->35|68->40|68->40|68->40|72->44|72->44|72->44|77->49|78->50|87->59|87->59|87->59|93->65|93->65|93->65|95->67|95->67|95->67
                  -- GENERATED --
              */
          