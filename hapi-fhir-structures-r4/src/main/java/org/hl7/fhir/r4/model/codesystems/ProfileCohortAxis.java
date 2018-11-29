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


import org.hl7.fhir.exceptions.FHIRException;

public enum ProfileCohortAxis {

        /**
         * The age group to which the subject belonged at the point of data collection.
         */
        AGEGROUP, 
        /**
         * The race of the subject.
         */
        RACE, 
        /**
         * The ethnicity of the subject.
         */
        ETHNICITY, 
        /**
         * The subject gender.
         */
        GENDER, 
        /**
         * The main or primary diagnosis.
         */
        DIAGNOSIS, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ProfileCohortAxis fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("ageGroup".equals(codeString))
          return AGEGROUP;
        if ("race".equals(codeString))
          return RACE;
        if ("ethnicity".equals(codeString))
          return ETHNICITY;
        if ("gender".equals(codeString))
          return GENDER;
        if ("diagnosis".equals(codeString))
          return DIAGNOSIS;
        throw new FHIRException("Unknown ProfileCohortAxis code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case AGEGROUP: return "ageGroup";
            case RACE: return "race";
            case ETHNICITY: return "ethnicity";
            case GENDER: return "gender";
            case DIAGNOSIS: return "diagnosis";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://terminology.hl7.org/CodeSystem/profile-cohort-axis";
        }
        public String getDefinition() {
          switch (this) {
            case AGEGROUP: return "The age group to which the subject belonged at the point of data collection.";
            case RACE: return "The race of the subject.";
            case ETHNICITY: return "The ethnicity of the subject.";
            case GENDER: return "The subject gender.";
            case DIAGNOSIS: return "The main or primary diagnosis.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case AGEGROUP: return "Age Group";
            case RACE: return "Race";
            case ETHNICITY: return "Ethnicity";
            case GENDER: return "Gender";
            case DIAGNOSIS: return "Diagnosis";
            default: return "?";
          }
    }


}

