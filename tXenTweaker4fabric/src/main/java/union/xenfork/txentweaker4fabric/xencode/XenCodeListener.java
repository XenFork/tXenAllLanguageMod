package union.xenfork.txentweaker4fabric.xencode;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import union.xenfork.g4.XenCodeBaseListener;
import union.xenfork.g4.XenCodeLexer;
import union.xenfork.g4.XenCodeParser;

import java.util.List;

public class XenCodeListener extends XenCodeBaseListener {
	private final BufferedTokenStream tokens;
	private final TokenStreamRewriter rewriter;
	public XenCodeListener(BufferedTokenStream tokens) {
		this.tokens = tokens;
		this.rewriter = new TokenStreamRewriter(tokens);
	}

	@Override
	public void enterAll(XenCodeParser.AllContext ctx) {
		Token semi = ctx.getStop();
		int i = semi.getTokenIndex();

		super.enterAll(ctx);
	}
}
