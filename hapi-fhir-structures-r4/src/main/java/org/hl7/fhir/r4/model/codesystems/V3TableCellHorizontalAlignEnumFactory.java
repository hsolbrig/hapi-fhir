package org.hl7.fhir.r4.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Wed, Nov 21, 2018 11:18-0500 for FHIR v3.6.0


import org.hl7.fhir.r4.model.EnumFactory;

public class V3TableCellHorizontalAlignEnumFactory implements EnumFactory<V3TableCellHorizontalAlign> {

  public V3TableCellHorizontalAlign fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("center".equals(codeString))
      return V3TableCellHorizontalAlign.CENTER;
    if ("char".equals(codeString))
      return V3TableCellHorizontalAlign.CHAR;
    if ("justify".equals(codeString))
      return V3TableCellHorizontalAlign.JUSTIFY;
    if ("left".equals(codeString))
      return V3TableCellHorizontalAlign.LEFT;
    if ("right".equals(codeString))
      return V3TableCellHorizontalAlign.RIGHT;
    throw new IllegalArgumentException("Unknown V3TableCellHorizontalAlign code '"+codeString+"'");
  }

  public String toCode(V3TableCellHorizontalAlign code) {
    if (code == V3TableCellHorizontalAlign.CENTER)
      return "center";
    if (code == V3TableCellHorizontalAlign.CHAR)
      return "char";
    if (code == V3TableCellHorizontalAlign.JUSTIFY)
      return "justify";
    if (code == V3TableCellHorizontalAlign.LEFT)
      return "left";
    if (code == V3TableCellHorizontalAlign.RIGHT)
      return "right";
    return "?";
  }

    public String toSystem(V3TableCellHorizontalAlign code) {
      return code.getSystem();
      }

}

