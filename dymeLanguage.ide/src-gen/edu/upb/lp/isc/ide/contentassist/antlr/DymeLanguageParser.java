/*
 * generated by Xtext 2.26.0
 */
package edu.upb.lp.isc.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.upb.lp.isc.ide.contentassist.antlr.internal.InternalDymeLanguageParser;
import edu.upb.lp.isc.services.DymeLanguageGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DymeLanguageParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DymeLanguageGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DymeLanguageGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTipoAccess().getAlternatives(), "rule__Tipo__Alternatives");
			builder.put(grammarAccess.getExpresionAccess().getAlternatives(), "rule__Expresion__Alternatives");
			builder.put(grammarAccess.getExprSimpleAccess().getAlternatives(), "rule__ExprSimple__Alternatives");
			builder.put(grammarAccess.getPlanetaAccess().getAlternatives_0(), "rule__Planeta__Alternatives_0");
			builder.put(grammarAccess.getPlanetaAccess().getAlternatives_1(), "rule__Planeta__Alternatives_1");
			builder.put(grammarAccess.getFuncionAccess().getGroup(), "rule__Funcion__Group__0");
			builder.put(grammarAccess.getFuncionAccess().getGroup_3(), "rule__Funcion__Group_3__0");
			builder.put(grammarAccess.getFuncionAccess().getGroup_3_1(), "rule__Funcion__Group_3_1__0");
			builder.put(grammarAccess.getLlamadoFuncAccess().getGroup(), "rule__LlamadoFunc__Group__0");
			builder.put(grammarAccess.getLlamadoFuncAccess().getGroup_2(), "rule__LlamadoFunc__Group_2__0");
			builder.put(grammarAccess.getLlamadoFuncAccess().getGroup_2_1(), "rule__LlamadoFunc__Group_2_1__0");
			builder.put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
			builder.put(grammarAccess.getAsignacionAccess().getGroup(), "rule__Asignacion__Group__0");
			builder.put(grammarAccess.getAsignacionAccess().getGroup_2(), "rule__Asignacion__Group_2__0");
			builder.put(grammarAccess.getSumaAccess().getGroup(), "rule__Suma__Group__0");
			builder.put(grammarAccess.getPlanetaAccess().getGroup(), "rule__Planeta__Group__0");
			builder.put(grammarAccess.getFuncionAccess().getNameAssignment_1(), "rule__Funcion__NameAssignment_1");
			builder.put(grammarAccess.getFuncionAccess().getParamAssignment_3_0(), "rule__Funcion__ParamAssignment_3_0");
			builder.put(grammarAccess.getFuncionAccess().getParamAssignment_3_1_1(), "rule__Funcion__ParamAssignment_3_1_1");
			builder.put(grammarAccess.getFuncionAccess().getInstrAssignment_5(), "rule__Funcion__InstrAssignment_5");
			builder.put(grammarAccess.getFuncionAccess().getTipAssignment_8(), "rule__Funcion__TipAssignment_8");
			builder.put(grammarAccess.getLlamadoFuncAccess().getFuncionAssignment_0(), "rule__LlamadoFunc__FuncionAssignment_0");
			builder.put(grammarAccess.getLlamadoFuncAccess().getArgsAssignment_2_0(), "rule__LlamadoFunc__ArgsAssignment_2_0");
			builder.put(grammarAccess.getLlamadoFuncAccess().getArgsAssignment_2_1_1(), "rule__LlamadoFunc__ArgsAssignment_2_1_1");
			builder.put(grammarAccess.getParamAccess().getNameAssignment_0(), "rule__Param__NameAssignment_0");
			builder.put(grammarAccess.getParamAccess().getTipAssignment_2(), "rule__Param__TipAssignment_2");
			builder.put(grammarAccess.getAsignacionAccess().getNameAssignment_1(), "rule__Asignacion__NameAssignment_1");
			builder.put(grammarAccess.getAsignacionAccess().getTipAssignment_2_1(), "rule__Asignacion__TipAssignment_2_1");
			builder.put(grammarAccess.getAsignacionAccess().getValorAssignment_4(), "rule__Asignacion__ValorAssignment_4");
			builder.put(grammarAccess.getSumaAccess().getIzqAssignment_0(), "rule__Suma__IzqAssignment_0");
			builder.put(grammarAccess.getSumaAccess().getDerAssignment_2(), "rule__Suma__DerAssignment_2");
			builder.put(grammarAccess.getExprSimpleAccess().getXAssignment_0(), "rule__ExprSimple__XAssignment_0");
			builder.put(grammarAccess.getExprSimpleAccess().getPAssignment_1(), "rule__ExprSimple__PAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DymeLanguageGrammarAccess grammarAccess;

	@Override
	protected InternalDymeLanguageParser createParser() {
		InternalDymeLanguageParser result = new InternalDymeLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DymeLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DymeLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
