/*-- 

 Copyright (C) 2000 Brett McLaughlin & Jason Hunter.
 All rights reserved.
 
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions, and the following disclaimer.
 
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions, and the disclaimer that follows 
    these conditions in the documentation and/or other materials 
    provided with the distribution.

 3. The name "JDOM" must not be used to endorse or promote products
    derived from this software without prior written permission.  For
    written permission, please contact license@jdom.org.
 
 4. Products derived from this software may not be called "JDOM", nor
    may "JDOM" appear in their name, without prior written permission
    from the JDOM Project Management (pm@jdom.org).
 
 In addition, we request (but do not require) that you include in the 
 end-user documentation provided with the redistribution and/or in the 
 software itself an acknowledgement equivalent to the following:
     "This product includes software developed by the
      JDOM Project (http://www.jdom.org/)."
 Alternatively, the acknowledgment may be graphical using the logos 
 available at http://www.jdom.org/images/logos.

 THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 SUCH DAMAGE.

 This software consists of voluntary contributions made by many 
 individuals on behalf of the JDOM Project and was originally 
 created by Brett McLaughlin <brett@jdom.org> and 
 Jason Hunter <jhunter@jdom.org>.  For more information on the 
 JDOM Project, please see <http://www.jdom.org/>.
 
 */

package org.jdom.test.cases;

import org.jdom.Element;
import org.jdom.Namespace;

import junit.framework.TestCase;

/**
 * <p>
 * This is a test for the constructor of the <code>Element</code> class which
 * can take a name and a namespace as its arguments.
 * </p>
 * 
 * @author  Jools Enticknap
 * @version 0.1
 */
public final class TCC_Element__String_OrgJdomNamespace extends TestCase {

    /**
     *  Construct a new instance. 
     */
    public TCC_Element__String_OrgJdomNamespace(String s) {
        super(s);
    }

    /**
     * <p>
	 * This test will ensure that an <code>Element</code> created with a 
	 * specific name and a <code>Namespace</code> remains as such after
	 * the Object is created.
	 * </p>
     */
    public void test() {
		String prefix = "test-prefix";
		String uri    = "test-uri";
		Namespace ns = Namespace.getNamespace(prefix, uri);
		String name = "test-element";
		Element e = new Element(name, ns);

		// Check that the name supplied in the argument to the constructor
		// is the same as the one returned from getName().
		if (!e.getName().equals("test-element")) {
			StringBuffer sb = new StringBuffer("The Element was constructed ")
			                  .append("using the the name(")
							  .append(name)
							  .append(") but the following value was ")
							  .append("returned from getName() (")
							  .append(e.getName())
							  .append(")");
	
        	fail(sb.toString());
		}

		// Check that the namespace is the one we supplied in the constructor.
		if (e.getNamespace() != ns) {
			StringBuffer sb = new StringBuffer("The Element was constructed ")
			                  .append("with a namespace, however ")
							  .append("getNamespace() does not return a ")
							  .append("reference to Namespace supplied in the ")
							  .append("constructor instead we have a reference ")
							  .append("to(")
							  .append(e.getNamespace())
							  .append(") instead.");

        	fail(sb.toString());
		}
    }
}