/*
 * <p>Copyright (c) 1998-2010, Peter T Mount<br>
 * All rights reserved.</p>
 *
 * <p>Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:</p>
 *
 * <ul>
 *   <li>Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.</li>
 *
 *   <li>Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.</li>
 *
 *   <li>Neither the name of the retep.org.uk nor the names of its contributors
 *   may be used to endorse or promote products derived from this software
 *   without specific prior written permission.</li>
 *
 * </ul>
 *
 * <p>THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.</p>
 */
package uk.org.retep.niosax;

import org.xml.sax.SAXException;

/**
 * {@link org.xml.sax.SAXException} thrown by {@link NioSaxParser} when a namespace is
 * referenced but has not been declared within the current
 * {@link org.xml.sax.helpers.NamespaceSupport} context.
 *
 * @author peter
 * @since 9.10
 */
public class UndeclaredNamespaceException
        extends SAXException
{

    private static final String msg = "Undeclared namespace";
    private final String qName;

    public UndeclaredNamespaceException( final String qName )
    {
        super( msg + " " + qName );
        this.qName = qName;
    }

    public UndeclaredNamespaceException( final String qName, final Exception e )
    {
        super( msg + " " + qName, e );
        this.qName = qName;
    }

    /**
     * The QName that caused the failure
     * @return the QName that caused the failure
     */
    public final String getQName()
    {
        return qName;
    }
}
