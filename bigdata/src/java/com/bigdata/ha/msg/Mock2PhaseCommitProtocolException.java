/**

Copyright (C) SYSTAP, LLC 2006-2015.  All rights reserved.

Contact:
     SYSTAP, LLC
     2501 Calvert ST NW #106
     Washington, DC 20008
     licenses@systap.com

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; version 2 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
package com.bigdata.ha.msg;

/**
 * Instances of this class are used when one of the
 * {@link IHA2PhaseCommitProtocolMessage}s is configured to force a runtime
 * exception during the 2-phase commit protocol.
 * 
 * @author <a href="mailto:thompsonbry@users.sourceforge.net">Bryan Thompson</a>
 */
public class Mock2PhaseCommitProtocolException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public Mock2PhaseCommitProtocolException() {
        super();
    }

    public Mock2PhaseCommitProtocolException(final String msg) {
        super(msg);
    }

    public Mock2PhaseCommitProtocolException(final RuntimeException cause) {

        super(cause);

    }

}
