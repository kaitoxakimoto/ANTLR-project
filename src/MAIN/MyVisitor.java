package MAIN;

import java.util.HashMap;
import java.util.Map;

import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTParser;
public class MyVisitor extends ParserTBaseVisitor<Integer> {
	private Map<String, String> variables = new HashMap<String, String>();

	@Override
	public Integer visitProgram(ParserTParser.ProgramContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitConstan(ParserTParser.ConstanContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitReceta(ParserTParser.RecetaContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitDeclavar(ParserTParser.DeclavarContext ctx) {
		String id = "";
		String value = "";
		if (ctx.linea() != null) {
			id = ctx.linea().VARNAME().getText();
			value = ctx.linea().CADENA().getText();
			
		} else if (ctx.entero() != null) {
			id = ctx.entero().VARNAME().getText();
			value = ctx.entero().INT().getText();
		} else if (ctx.flotante() != null) {
			id = ctx.flotante().VARNAME().getText();
			value = ctx.flotante().FLOAT().getText();
		}
		variables.put(id,value);
		return visitChildren(ctx);
	}


	@Override
	public Integer visitLinea(ParserTParser.LineaContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitEntero(ParserTParser.EnteroContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitFlotante(ParserTParser.FlotanteContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitStatement(ParserTParser.StatementContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitOperacion(ParserTParser.OperacionContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitCiclo(ParserTParser.CicloContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitAsignacion(ParserTParser.AsignacionContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitLectura(ParserTParser.LecturaContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitImpresion(ParserTParser.ImpresionContext ctx) {
		String var = ctx.VARNAME().getText();
		System.out.printf("%s\n",variables.get(var));
		return visitChildren(ctx);
	}


	@Override
	public Integer visitSuma(ParserTParser.SumaContext ctx) {
		String var1 = ctx.VARNAME(0).getText();
		String var2 = ctx.VARNAME(1).getText();
		float num1 = Float.parseFloat(variables.get(var1));
		float num2 = Float.parseFloat(variables.get(var2));
		variables.put(var1, String.valueOf(num1+num2));

		return visitChildren(ctx);
	}


	@Override
	public Integer visitMultiplicacion(ParserTParser.MultiplicacionContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitResta(ParserTParser.RestaContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitDivision(ParserTParser.DivisionContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitSqrt(ParserTParser.SqrtContext ctx) {
		String var1 = ctx.VARNAME().getText();
		float num1 = Float.parseFloat(variables.get(var1));
		variables.put(var1, String.valueOf(Math.sqrt(num1)));

		return visitChildren(ctx);
	}


	@Override
	public Integer visitCos(ParserTParser.CosContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitSin(ParserTParser.SinContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitSi(ParserTParser.SiContext ctx) {
		
		Integer senlogica = visitSenlogica(ctx.senlogica());

		if(senlogica == 1){
			Integer i = 0;
			for (i = 0;ctx.statement(i)!= null;i++){
				visitStatement(ctx.statement(i));
			}
		}


		return 1;
	}


	@Override
	public Integer visitDowhile(ParserTParser.DowhileContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitMientras(ParserTParser.MientrasContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitSenlogica(ParserTParser.SenlogicaContext ctx) {
		Integer valor = visitAfirmacion(ctx.afirmacion(0));
		return valor;
	}


	@Override
	public Integer visitAfirmacion(ParserTParser.AfirmacionContext ctx) {
		Integer valor = 0;
		if (ctx.mayor()!=null){
			valor = visitMayor(ctx.mayor());
		}
		return valor;
	}


	@Override
	public Integer visitMayor(ParserTParser.MayorContext ctx) {
		String text1 = ctx.VARNAME(0).getText();
		String text2 = ctx.VARNAME(1).getText();
		Float var1 = Float.parseFloat(variables.get(text1));
		Float var2 = Float.parseFloat(variables.get(text2));

		
		if (var1 > var2){
			return 1;
		}
		
		return 0;
	}


	@Override
	public Integer visitMenor(ParserTParser.MenorContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitIgual(ParserTParser.IgualContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public Integer visitDistinto(ParserTParser.DistintoContext ctx) {
		return visitChildren(ctx);
	}

}
