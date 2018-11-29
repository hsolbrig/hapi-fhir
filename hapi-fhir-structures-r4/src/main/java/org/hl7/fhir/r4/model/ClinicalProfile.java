package org.hl7.fhir.r4.model;

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

import java.util.*;

import java.math.*;
import org.hl7.fhir.utilities.Utilities;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;
import org.hl7.fhir.instance.model.api.*;
import org.hl7.fhir.exceptions.FHIRException;
/**
 * Clinical Profiles summarize and demonstrate the features of a population.
 */
@ResourceDef(name="ClinicalProfile", profile="http://hl7.org/fhir/StructureDefinition/ClinicalProfile")
public class ClinicalProfile extends DomainResource {

    public enum ClinicalProfileStatus {
        /**
         * The report is complete and ready for use.
         */
        COMPLETE, 
        /**
         * A report is available but it hasn't vbeen verified.
         */
        DRAFT, 
        /**
         * The report is not to be used because some sort of error has occurred.
         */
        ERROR, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static ClinicalProfileStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("complete".equals(codeString))
          return COMPLETE;
        if ("draft".equals(codeString))
          return DRAFT;
        if ("error".equals(codeString))
          return ERROR;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown ClinicalProfileStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case COMPLETE: return "complete";
            case DRAFT: return "draft";
            case ERROR: return "error";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case COMPLETE: return "http://hl7.org/fhir/clinical-profile-status";
            case DRAFT: return "http://hl7.org/fhir/clinical-profile-status";
            case ERROR: return "http://hl7.org/fhir/clinical-profile-status";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case COMPLETE: return "The report is complete and ready for use.";
            case DRAFT: return "A report is available but it hasn't vbeen verified.";
            case ERROR: return "The report is not to be used because some sort of error has occurred.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case COMPLETE: return "Complete";
            case DRAFT: return "Draft";
            case ERROR: return "Error";
            default: return "?";
          }
        }
    }

  public static class ClinicalProfileStatusEnumFactory implements EnumFactory<ClinicalProfileStatus> {
    public ClinicalProfileStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("complete".equals(codeString))
          return ClinicalProfileStatus.COMPLETE;
        if ("draft".equals(codeString))
          return ClinicalProfileStatus.DRAFT;
        if ("error".equals(codeString))
          return ClinicalProfileStatus.ERROR;
        throw new IllegalArgumentException("Unknown ClinicalProfileStatus code '"+codeString+"'");
        }
        public Enumeration<ClinicalProfileStatus> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ClinicalProfileStatus>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("complete".equals(codeString))
          return new Enumeration<ClinicalProfileStatus>(this, ClinicalProfileStatus.COMPLETE);
        if ("draft".equals(codeString))
          return new Enumeration<ClinicalProfileStatus>(this, ClinicalProfileStatus.DRAFT);
        if ("error".equals(codeString))
          return new Enumeration<ClinicalProfileStatus>(this, ClinicalProfileStatus.ERROR);
        throw new FHIRException("Unknown ClinicalProfileStatus code '"+codeString+"'");
        }
    public String toCode(ClinicalProfileStatus code) {
      if (code == ClinicalProfileStatus.COMPLETE)
        return "complete";
      if (code == ClinicalProfileStatus.DRAFT)
        return "draft";
      if (code == ClinicalProfileStatus.ERROR)
        return "error";
      return "?";
      }
    public String toSystem(ClinicalProfileStatus code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class ClinicalProfileLabComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Code(s) for the tests that compose this specific sample.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Lab code (LOINC)", formalDefinition="Code(s) for the tests that compose this specific sample." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/observation-codes")
        protected List<CodeableConcept> code;

        /**
         * Total number of lab tests.
         */
        @Child(name = "count", type = {IntegerType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Total number of lab tests", formalDefinition="Total number of lab tests." )
        protected IntegerType count;

        /**
         * The average number of times this test was ordered and reported per patient in the particular cohort per year.
         */
        @Child(name = "frequencyPerYear", type = {DecimalType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Frequency of this lab ordered/reported per patient per year", formalDefinition="The average number of times this test was ordered and reported per patient in the particular cohort per year." )
        protected DecimalType frequencyPerYear;

        /**
         * The fraction of the patients in this cohort that have one or more orders for this lab.
         */
        @Child(name = "fractionOfSubjects", type = {DecimalType.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Fraction of subjects with this lab", formalDefinition="The fraction of the patients in this cohort that have one or more orders for this lab." )
        protected DecimalType fractionOfSubjects;

        /**
         * Scalar sample summary.
         */
        @Child(name = "scalarDistribution", type = {}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Scalar sample summary", formalDefinition="Scalar sample summary." )
        protected ClinicalProfileLabScalarDistributionComponent scalarDistribution;

        private static final long serialVersionUID = -1145613225L;

    /**
     * Constructor
     */
      public ClinicalProfileLabComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileLabComponent(IntegerType count) {
        super();
        this.count = count;
      }

        /**
         * @return {@link #code} (Code(s) for the tests that compose this specific sample.)
         */
        public List<CodeableConcept> getCode() { 
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          return this.code;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileLabComponent setCode(List<CodeableConcept> theCode) { 
          this.code = theCode;
          return this;
        }

        public boolean hasCode() { 
          if (this.code == null)
            return false;
          for (CodeableConcept item : this.code)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addCode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return t;
        }

        public ClinicalProfileLabComponent addCode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #code}, creating it if it does not already exist
         */
        public CodeableConcept getCodeFirstRep() { 
          if (getCode().isEmpty()) {
            addCode();
          }
          return getCode().get(0);
        }

        /**
         * @return {@link #count} (Total number of lab tests.). This is the underlying object with id, value and extensions. The accessor "getCount" gives direct access to the value
         */
        public IntegerType getCountElement() { 
          if (this.count == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabComponent.count");
            else if (Configuration.doAutoCreate())
              this.count = new IntegerType(); // bb
          return this.count;
        }

        public boolean hasCountElement() { 
          return this.count != null && !this.count.isEmpty();
        }

        public boolean hasCount() { 
          return this.count != null && !this.count.isEmpty();
        }

        /**
         * @param value {@link #count} (Total number of lab tests.). This is the underlying object with id, value and extensions. The accessor "getCount" gives direct access to the value
         */
        public ClinicalProfileLabComponent setCountElement(IntegerType value) { 
          this.count = value;
          return this;
        }

        /**
         * @return Total number of lab tests.
         */
        public int getCount() { 
          return this.count == null || this.count.isEmpty() ? 0 : this.count.getValue();
        }

        /**
         * @param value Total number of lab tests.
         */
        public ClinicalProfileLabComponent setCount(int value) { 
            if (this.count == null)
              this.count = new IntegerType();
            this.count.setValue(value);
          return this;
        }

        /**
         * @return {@link #frequencyPerYear} (The average number of times this test was ordered and reported per patient in the particular cohort per year.). This is the underlying object with id, value and extensions. The accessor "getFrequencyPerYear" gives direct access to the value
         */
        public DecimalType getFrequencyPerYearElement() { 
          if (this.frequencyPerYear == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabComponent.frequencyPerYear");
            else if (Configuration.doAutoCreate())
              this.frequencyPerYear = new DecimalType(); // bb
          return this.frequencyPerYear;
        }

        public boolean hasFrequencyPerYearElement() { 
          return this.frequencyPerYear != null && !this.frequencyPerYear.isEmpty();
        }

        public boolean hasFrequencyPerYear() { 
          return this.frequencyPerYear != null && !this.frequencyPerYear.isEmpty();
        }

        /**
         * @param value {@link #frequencyPerYear} (The average number of times this test was ordered and reported per patient in the particular cohort per year.). This is the underlying object with id, value and extensions. The accessor "getFrequencyPerYear" gives direct access to the value
         */
        public ClinicalProfileLabComponent setFrequencyPerYearElement(DecimalType value) { 
          this.frequencyPerYear = value;
          return this;
        }

        /**
         * @return The average number of times this test was ordered and reported per patient in the particular cohort per year.
         */
        public BigDecimal getFrequencyPerYear() { 
          return this.frequencyPerYear == null ? null : this.frequencyPerYear.getValue();
        }

        /**
         * @param value The average number of times this test was ordered and reported per patient in the particular cohort per year.
         */
        public ClinicalProfileLabComponent setFrequencyPerYear(BigDecimal value) { 
          if (value == null)
            this.frequencyPerYear = null;
          else {
            if (this.frequencyPerYear == null)
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          }
          return this;
        }

        /**
         * @param value The average number of times this test was ordered and reported per patient in the particular cohort per year.
         */
        public ClinicalProfileLabComponent setFrequencyPerYear(long value) { 
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          return this;
        }

        /**
         * @param value The average number of times this test was ordered and reported per patient in the particular cohort per year.
         */
        public ClinicalProfileLabComponent setFrequencyPerYear(double value) { 
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          return this;
        }

        /**
         * @return {@link #fractionOfSubjects} (The fraction of the patients in this cohort that have one or more orders for this lab.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public DecimalType getFractionOfSubjectsElement() { 
          if (this.fractionOfSubjects == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabComponent.fractionOfSubjects");
            else if (Configuration.doAutoCreate())
              this.fractionOfSubjects = new DecimalType(); // bb
          return this.fractionOfSubjects;
        }

        public boolean hasFractionOfSubjectsElement() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        public boolean hasFractionOfSubjects() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        /**
         * @param value {@link #fractionOfSubjects} (The fraction of the patients in this cohort that have one or more orders for this lab.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public ClinicalProfileLabComponent setFractionOfSubjectsElement(DecimalType value) { 
          this.fractionOfSubjects = value;
          return this;
        }

        /**
         * @return The fraction of the patients in this cohort that have one or more orders for this lab.
         */
        public BigDecimal getFractionOfSubjects() { 
          return this.fractionOfSubjects == null ? null : this.fractionOfSubjects.getValue();
        }

        /**
         * @param value The fraction of the patients in this cohort that have one or more orders for this lab.
         */
        public ClinicalProfileLabComponent setFractionOfSubjects(BigDecimal value) { 
          if (value == null)
            this.fractionOfSubjects = null;
          else {
            if (this.fractionOfSubjects == null)
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          }
          return this;
        }

        /**
         * @param value The fraction of the patients in this cohort that have one or more orders for this lab.
         */
        public ClinicalProfileLabComponent setFractionOfSubjects(long value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value The fraction of the patients in this cohort that have one or more orders for this lab.
         */
        public ClinicalProfileLabComponent setFractionOfSubjects(double value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @return {@link #scalarDistribution} (Scalar sample summary.)
         */
        public ClinicalProfileLabScalarDistributionComponent getScalarDistribution() { 
          if (this.scalarDistribution == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabComponent.scalarDistribution");
            else if (Configuration.doAutoCreate())
              this.scalarDistribution = new ClinicalProfileLabScalarDistributionComponent(); // cc
          return this.scalarDistribution;
        }

        public boolean hasScalarDistribution() { 
          return this.scalarDistribution != null && !this.scalarDistribution.isEmpty();
        }

        /**
         * @param value {@link #scalarDistribution} (Scalar sample summary.)
         */
        public ClinicalProfileLabComponent setScalarDistribution(ClinicalProfileLabScalarDistributionComponent value) { 
          this.scalarDistribution = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "Code(s) for the tests that compose this specific sample.", 0, java.lang.Integer.MAX_VALUE, code));
          children.add(new Property("count", "integer", "Total number of lab tests.", 0, 1, count));
          children.add(new Property("frequencyPerYear", "decimal", "The average number of times this test was ordered and reported per patient in the particular cohort per year.", 0, 1, frequencyPerYear));
          children.add(new Property("fractionOfSubjects", "decimal", "The fraction of the patients in this cohort that have one or more orders for this lab.", 0, 1, fractionOfSubjects));
          children.add(new Property("scalarDistribution", "", "Scalar sample summary.", 0, 1, scalarDistribution));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "Code(s) for the tests that compose this specific sample.", 0, java.lang.Integer.MAX_VALUE, code);
          case 94851343: /*count*/  return new Property("count", "integer", "Total number of lab tests.", 0, 1, count);
          case 751135230: /*frequencyPerYear*/  return new Property("frequencyPerYear", "decimal", "The average number of times this test was ordered and reported per patient in the particular cohort per year.", 0, 1, frequencyPerYear);
          case -254443680: /*fractionOfSubjects*/  return new Property("fractionOfSubjects", "decimal", "The fraction of the patients in this cohort that have one or more orders for this lab.", 0, 1, fractionOfSubjects);
          case 1459962000: /*scalarDistribution*/  return new Property("scalarDistribution", "", "Scalar sample summary.", 0, 1, scalarDistribution);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : this.code.toArray(new Base[this.code.size()]); // CodeableConcept
        case 94851343: /*count*/ return this.count == null ? new Base[0] : new Base[] {this.count}; // IntegerType
        case 751135230: /*frequencyPerYear*/ return this.frequencyPerYear == null ? new Base[0] : new Base[] {this.frequencyPerYear}; // DecimalType
        case -254443680: /*fractionOfSubjects*/ return this.fractionOfSubjects == null ? new Base[0] : new Base[] {this.fractionOfSubjects}; // DecimalType
        case 1459962000: /*scalarDistribution*/ return this.scalarDistribution == null ? new Base[0] : new Base[] {this.scalarDistribution}; // ClinicalProfileLabScalarDistributionComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.getCode().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 94851343: // count
          this.count = castToInteger(value); // IntegerType
          return value;
        case 751135230: // frequencyPerYear
          this.frequencyPerYear = castToDecimal(value); // DecimalType
          return value;
        case -254443680: // fractionOfSubjects
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
          return value;
        case 1459962000: // scalarDistribution
          this.scalarDistribution = (ClinicalProfileLabScalarDistributionComponent) value; // ClinicalProfileLabScalarDistributionComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.getCode().add(castToCodeableConcept(value));
        } else if (name.equals("count")) {
          this.count = castToInteger(value); // IntegerType
        } else if (name.equals("frequencyPerYear")) {
          this.frequencyPerYear = castToDecimal(value); // DecimalType
        } else if (name.equals("fractionOfSubjects")) {
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
        } else if (name.equals("scalarDistribution")) {
          this.scalarDistribution = (ClinicalProfileLabScalarDistributionComponent) value; // ClinicalProfileLabScalarDistributionComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return addCode(); 
        case 94851343:  return getCountElement();
        case 751135230:  return getFrequencyPerYearElement();
        case -254443680:  return getFractionOfSubjectsElement();
        case 1459962000:  return getScalarDistribution(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case 94851343: /*count*/ return new String[] {"integer"};
        case 751135230: /*frequencyPerYear*/ return new String[] {"decimal"};
        case -254443680: /*fractionOfSubjects*/ return new String[] {"decimal"};
        case 1459962000: /*scalarDistribution*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          return addCode();
        }
        else if (name.equals("count")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.count");
        }
        else if (name.equals("frequencyPerYear")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.frequencyPerYear");
        }
        else if (name.equals("fractionOfSubjects")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionOfSubjects");
        }
        else if (name.equals("scalarDistribution")) {
          this.scalarDistribution = new ClinicalProfileLabScalarDistributionComponent();
          return this.scalarDistribution;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabComponent copy() {
        ClinicalProfileLabComponent dst = new ClinicalProfileLabComponent();
        copyValues(dst);
        if (code != null) {
          dst.code = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : code)
            dst.code.add(i.copy());
        };
        dst.count = count == null ? null : count.copy();
        dst.frequencyPerYear = frequencyPerYear == null ? null : frequencyPerYear.copy();
        dst.fractionOfSubjects = fractionOfSubjects == null ? null : fractionOfSubjects.copy();
        dst.scalarDistribution = scalarDistribution == null ? null : scalarDistribution.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabComponent))
          return false;
        ClinicalProfileLabComponent o = (ClinicalProfileLabComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(count, o.count, true) && compareDeep(frequencyPerYear, o.frequencyPerYear, true)
           && compareDeep(fractionOfSubjects, o.fractionOfSubjects, true) && compareDeep(scalarDistribution, o.scalarDistribution, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabComponent))
          return false;
        ClinicalProfileLabComponent o = (ClinicalProfileLabComponent) other_;
        return compareValues(count, o.count, true) && compareValues(frequencyPerYear, o.frequencyPerYear, true)
           && compareValues(fractionOfSubjects, o.fractionOfSubjects, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, count, frequencyPerYear
          , fractionOfSubjects, scalarDistribution);
      }

  public String fhirType() {
    return "ClinicalProfile.lab";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Units of numeric result -- this is not actually a quantity… value is not allowed.
         */
        @Child(name = "units", type = {Quantity.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Units of scalar result", formalDefinition="Units of numeric result -- this is not actually a quantity… value is not allowed." )
        protected Quantity units;

        /**
         * The minimum value of this lab for all of the patients in this cohort.
         */
        @Child(name = "min", type = {DecimalType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Minimum value", formalDefinition="The minimum value of this lab for all of the patients in this cohort." )
        protected DecimalType min;

        /**
         * The maximum value of this lab for all of the patients in this cohort.
         */
        @Child(name = "max", type = {DecimalType.class}, order=3, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Maximum value", formalDefinition="The maximum value of this lab for all of the patients in this cohort." )
        protected DecimalType max;

        /**
         * The mean or average value for all of the patients in this cohort.
         */
        @Child(name = "mean", type = {DecimalType.class}, order=4, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Mean", formalDefinition="The mean or average value for all of the patients in this cohort." )
        protected DecimalType mean;

        /**
         * The median value for all of the patients in this cohort.
         */
        @Child(name = "median", type = {DecimalType.class}, order=5, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Median", formalDefinition="The median value for all of the patients in this cohort." )
        protected DecimalType median;

        /**
         * The standard deviation for all of the patients in this cohort.
         */
        @Child(name = "stdDev", type = {DecimalType.class}, order=6, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Standard deviation", formalDefinition="The standard deviation for all of the patients in this cohort." )
        protected DecimalType stdDev;

        /**
         * Decile partitions.
         */
        @Child(name = "decile", type = {}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Decile partitions", formalDefinition="Decile partitions." )
        protected List<ClinicalProfileLabScalarDistributionDecileComponent> decile;

        /**
         * The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        @Child(name = "normalizedHigh", type = {DecimalType.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Normalize high normal range", formalDefinition="The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range." )
        protected DecimalType normalizedHigh;

        /**
         * The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        @Child(name = "normalizedLow", type = {DecimalType.class}, order=9, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Normalize low normal range", formalDefinition="The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range." )
        protected DecimalType normalizedLow;

        /**
         * Fraction of samples above normalized normal range.
         */
        @Child(name = "fractionAboveNormal", type = {DecimalType.class}, order=10, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Fraction of samples above normalized normal range", formalDefinition="Fraction of samples above normalized normal range." )
        protected DecimalType fractionAboveNormal;

        /**
         * Fraction of samples below normalized normal range.
         */
        @Child(name = "fractionBelowNormal", type = {DecimalType.class}, order=11, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Fraction of samples below normalized normal range", formalDefinition="Fraction of samples below normalized normal range." )
        protected DecimalType fractionBelowNormal;

        /**
         * An ordered list of the laboratory tests defined in the profile definition that are most closely correlated.  This list can be limited by the top "n" labs and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedLabs", type = {}, order=12, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The top labs with the most significant correlation", formalDefinition="An ordered list of the laboratory tests defined in the profile definition that are most closely correlated.  This list can be limited by the top \"n\" labs and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedLabsComponent correlatedLabs;

        private static final long serialVersionUID = -94565470L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionComponent(Quantity units, DecimalType min, DecimalType max, DecimalType mean, DecimalType median, DecimalType stdDev) {
        super();
        this.units = units;
        this.min = min;
        this.max = max;
        this.mean = mean;
        this.median = median;
        this.stdDev = stdDev;
      }

        /**
         * @return {@link #units} (Units of numeric result -- this is not actually a quantity… value is not allowed.)
         */
        public Quantity getUnits() { 
          if (this.units == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.units");
            else if (Configuration.doAutoCreate())
              this.units = new Quantity(); // cc
          return this.units;
        }

        public boolean hasUnits() { 
          return this.units != null && !this.units.isEmpty();
        }

        /**
         * @param value {@link #units} (Units of numeric result -- this is not actually a quantity… value is not allowed.)
         */
        public ClinicalProfileLabScalarDistributionComponent setUnits(Quantity value) { 
          this.units = value;
          return this;
        }

        /**
         * @return {@link #min} (The minimum value of this lab for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMin" gives direct access to the value
         */
        public DecimalType getMinElement() { 
          if (this.min == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.min");
            else if (Configuration.doAutoCreate())
              this.min = new DecimalType(); // bb
          return this.min;
        }

        public boolean hasMinElement() { 
          return this.min != null && !this.min.isEmpty();
        }

        public boolean hasMin() { 
          return this.min != null && !this.min.isEmpty();
        }

        /**
         * @param value {@link #min} (The minimum value of this lab for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMin" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setMinElement(DecimalType value) { 
          this.min = value;
          return this;
        }

        /**
         * @return The minimum value of this lab for all of the patients in this cohort.
         */
        public BigDecimal getMin() { 
          return this.min == null ? null : this.min.getValue();
        }

        /**
         * @param value The minimum value of this lab for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMin(BigDecimal value) { 
            if (this.min == null)
              this.min = new DecimalType();
            this.min.setValue(value);
          return this;
        }

        /**
         * @param value The minimum value of this lab for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMin(long value) { 
              this.min = new DecimalType();
            this.min.setValue(value);
          return this;
        }

        /**
         * @param value The minimum value of this lab for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMin(double value) { 
              this.min = new DecimalType();
            this.min.setValue(value);
          return this;
        }

        /**
         * @return {@link #max} (The maximum value of this lab for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMax" gives direct access to the value
         */
        public DecimalType getMaxElement() { 
          if (this.max == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.max");
            else if (Configuration.doAutoCreate())
              this.max = new DecimalType(); // bb
          return this.max;
        }

        public boolean hasMaxElement() { 
          return this.max != null && !this.max.isEmpty();
        }

        public boolean hasMax() { 
          return this.max != null && !this.max.isEmpty();
        }

        /**
         * @param value {@link #max} (The maximum value of this lab for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMax" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setMaxElement(DecimalType value) { 
          this.max = value;
          return this;
        }

        /**
         * @return The maximum value of this lab for all of the patients in this cohort.
         */
        public BigDecimal getMax() { 
          return this.max == null ? null : this.max.getValue();
        }

        /**
         * @param value The maximum value of this lab for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMax(BigDecimal value) { 
            if (this.max == null)
              this.max = new DecimalType();
            this.max.setValue(value);
          return this;
        }

        /**
         * @param value The maximum value of this lab for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMax(long value) { 
              this.max = new DecimalType();
            this.max.setValue(value);
          return this;
        }

        /**
         * @param value The maximum value of this lab for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMax(double value) { 
              this.max = new DecimalType();
            this.max.setValue(value);
          return this;
        }

        /**
         * @return {@link #mean} (The mean or average value for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMean" gives direct access to the value
         */
        public DecimalType getMeanElement() { 
          if (this.mean == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.mean");
            else if (Configuration.doAutoCreate())
              this.mean = new DecimalType(); // bb
          return this.mean;
        }

        public boolean hasMeanElement() { 
          return this.mean != null && !this.mean.isEmpty();
        }

        public boolean hasMean() { 
          return this.mean != null && !this.mean.isEmpty();
        }

        /**
         * @param value {@link #mean} (The mean or average value for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMean" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setMeanElement(DecimalType value) { 
          this.mean = value;
          return this;
        }

        /**
         * @return The mean or average value for all of the patients in this cohort.
         */
        public BigDecimal getMean() { 
          return this.mean == null ? null : this.mean.getValue();
        }

        /**
         * @param value The mean or average value for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMean(BigDecimal value) { 
            if (this.mean == null)
              this.mean = new DecimalType();
            this.mean.setValue(value);
          return this;
        }

        /**
         * @param value The mean or average value for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMean(long value) { 
              this.mean = new DecimalType();
            this.mean.setValue(value);
          return this;
        }

        /**
         * @param value The mean or average value for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMean(double value) { 
              this.mean = new DecimalType();
            this.mean.setValue(value);
          return this;
        }

        /**
         * @return {@link #median} (The median value for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMedian" gives direct access to the value
         */
        public DecimalType getMedianElement() { 
          if (this.median == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.median");
            else if (Configuration.doAutoCreate())
              this.median = new DecimalType(); // bb
          return this.median;
        }

        public boolean hasMedianElement() { 
          return this.median != null && !this.median.isEmpty();
        }

        public boolean hasMedian() { 
          return this.median != null && !this.median.isEmpty();
        }

        /**
         * @param value {@link #median} (The median value for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMedian" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setMedianElement(DecimalType value) { 
          this.median = value;
          return this;
        }

        /**
         * @return The median value for all of the patients in this cohort.
         */
        public BigDecimal getMedian() { 
          return this.median == null ? null : this.median.getValue();
        }

        /**
         * @param value The median value for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMedian(BigDecimal value) { 
            if (this.median == null)
              this.median = new DecimalType();
            this.median.setValue(value);
          return this;
        }

        /**
         * @param value The median value for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMedian(long value) { 
              this.median = new DecimalType();
            this.median.setValue(value);
          return this;
        }

        /**
         * @param value The median value for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMedian(double value) { 
              this.median = new DecimalType();
            this.median.setValue(value);
          return this;
        }

        /**
         * @return {@link #stdDev} (The standard deviation for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getStdDev" gives direct access to the value
         */
        public DecimalType getStdDevElement() { 
          if (this.stdDev == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.stdDev");
            else if (Configuration.doAutoCreate())
              this.stdDev = new DecimalType(); // bb
          return this.stdDev;
        }

        public boolean hasStdDevElement() { 
          return this.stdDev != null && !this.stdDev.isEmpty();
        }

        public boolean hasStdDev() { 
          return this.stdDev != null && !this.stdDev.isEmpty();
        }

        /**
         * @param value {@link #stdDev} (The standard deviation for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getStdDev" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setStdDevElement(DecimalType value) { 
          this.stdDev = value;
          return this;
        }

        /**
         * @return The standard deviation for all of the patients in this cohort.
         */
        public BigDecimal getStdDev() { 
          return this.stdDev == null ? null : this.stdDev.getValue();
        }

        /**
         * @param value The standard deviation for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setStdDev(BigDecimal value) { 
            if (this.stdDev == null)
              this.stdDev = new DecimalType();
            this.stdDev.setValue(value);
          return this;
        }

        /**
         * @param value The standard deviation for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setStdDev(long value) { 
              this.stdDev = new DecimalType();
            this.stdDev.setValue(value);
          return this;
        }

        /**
         * @param value The standard deviation for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setStdDev(double value) { 
              this.stdDev = new DecimalType();
            this.stdDev.setValue(value);
          return this;
        }

        /**
         * @return {@link #decile} (Decile partitions.)
         */
        public List<ClinicalProfileLabScalarDistributionDecileComponent> getDecile() { 
          if (this.decile == null)
            this.decile = new ArrayList<ClinicalProfileLabScalarDistributionDecileComponent>();
          return this.decile;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileLabScalarDistributionComponent setDecile(List<ClinicalProfileLabScalarDistributionDecileComponent> theDecile) { 
          this.decile = theDecile;
          return this;
        }

        public boolean hasDecile() { 
          if (this.decile == null)
            return false;
          for (ClinicalProfileLabScalarDistributionDecileComponent item : this.decile)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public ClinicalProfileLabScalarDistributionDecileComponent addDecile() { //3
          ClinicalProfileLabScalarDistributionDecileComponent t = new ClinicalProfileLabScalarDistributionDecileComponent();
          if (this.decile == null)
            this.decile = new ArrayList<ClinicalProfileLabScalarDistributionDecileComponent>();
          this.decile.add(t);
          return t;
        }

        public ClinicalProfileLabScalarDistributionComponent addDecile(ClinicalProfileLabScalarDistributionDecileComponent t) { //3
          if (t == null)
            return this;
          if (this.decile == null)
            this.decile = new ArrayList<ClinicalProfileLabScalarDistributionDecileComponent>();
          this.decile.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #decile}, creating it if it does not already exist
         */
        public ClinicalProfileLabScalarDistributionDecileComponent getDecileFirstRep() { 
          if (getDecile().isEmpty()) {
            addDecile();
          }
          return getDecile().get(0);
        }

        /**
         * @return {@link #normalizedHigh} (The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.). This is the underlying object with id, value and extensions. The accessor "getNormalizedHigh" gives direct access to the value
         */
        public DecimalType getNormalizedHighElement() { 
          if (this.normalizedHigh == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.normalizedHigh");
            else if (Configuration.doAutoCreate())
              this.normalizedHigh = new DecimalType(); // bb
          return this.normalizedHigh;
        }

        public boolean hasNormalizedHighElement() { 
          return this.normalizedHigh != null && !this.normalizedHigh.isEmpty();
        }

        public boolean hasNormalizedHigh() { 
          return this.normalizedHigh != null && !this.normalizedHigh.isEmpty();
        }

        /**
         * @param value {@link #normalizedHigh} (The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.). This is the underlying object with id, value and extensions. The accessor "getNormalizedHigh" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedHighElement(DecimalType value) { 
          this.normalizedHigh = value;
          return this;
        }

        /**
         * @return The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public BigDecimal getNormalizedHigh() { 
          return this.normalizedHigh == null ? null : this.normalizedHigh.getValue();
        }

        /**
         * @param value The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedHigh(BigDecimal value) { 
          if (value == null)
            this.normalizedHigh = null;
          else {
            if (this.normalizedHigh == null)
              this.normalizedHigh = new DecimalType();
            this.normalizedHigh.setValue(value);
          }
          return this;
        }

        /**
         * @param value The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedHigh(long value) { 
              this.normalizedHigh = new DecimalType();
            this.normalizedHigh.setValue(value);
          return this;
        }

        /**
         * @param value The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedHigh(double value) { 
              this.normalizedHigh = new DecimalType();
            this.normalizedHigh.setValue(value);
          return this;
        }

        /**
         * @return {@link #normalizedLow} (The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.). This is the underlying object with id, value and extensions. The accessor "getNormalizedLow" gives direct access to the value
         */
        public DecimalType getNormalizedLowElement() { 
          if (this.normalizedLow == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.normalizedLow");
            else if (Configuration.doAutoCreate())
              this.normalizedLow = new DecimalType(); // bb
          return this.normalizedLow;
        }

        public boolean hasNormalizedLowElement() { 
          return this.normalizedLow != null && !this.normalizedLow.isEmpty();
        }

        public boolean hasNormalizedLow() { 
          return this.normalizedLow != null && !this.normalizedLow.isEmpty();
        }

        /**
         * @param value {@link #normalizedLow} (The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.). This is the underlying object with id, value and extensions. The accessor "getNormalizedLow" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedLowElement(DecimalType value) { 
          this.normalizedLow = value;
          return this;
        }

        /**
         * @return The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public BigDecimal getNormalizedLow() { 
          return this.normalizedLow == null ? null : this.normalizedLow.getValue();
        }

        /**
         * @param value The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedLow(BigDecimal value) { 
          if (value == null)
            this.normalizedLow = null;
          else {
            if (this.normalizedLow == null)
              this.normalizedLow = new DecimalType();
            this.normalizedLow.setValue(value);
          }
          return this;
        }

        /**
         * @param value The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedLow(long value) { 
              this.normalizedLow = new DecimalType();
            this.normalizedLow.setValue(value);
          return this;
        }

        /**
         * @param value The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedLow(double value) { 
              this.normalizedLow = new DecimalType();
            this.normalizedLow.setValue(value);
          return this;
        }

        /**
         * @return {@link #fractionAboveNormal} (Fraction of samples above normalized normal range.). This is the underlying object with id, value and extensions. The accessor "getFractionAboveNormal" gives direct access to the value
         */
        public DecimalType getFractionAboveNormalElement() { 
          if (this.fractionAboveNormal == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.fractionAboveNormal");
            else if (Configuration.doAutoCreate())
              this.fractionAboveNormal = new DecimalType(); // bb
          return this.fractionAboveNormal;
        }

        public boolean hasFractionAboveNormalElement() { 
          return this.fractionAboveNormal != null && !this.fractionAboveNormal.isEmpty();
        }

        public boolean hasFractionAboveNormal() { 
          return this.fractionAboveNormal != null && !this.fractionAboveNormal.isEmpty();
        }

        /**
         * @param value {@link #fractionAboveNormal} (Fraction of samples above normalized normal range.). This is the underlying object with id, value and extensions. The accessor "getFractionAboveNormal" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionAboveNormalElement(DecimalType value) { 
          this.fractionAboveNormal = value;
          return this;
        }

        /**
         * @return Fraction of samples above normalized normal range.
         */
        public BigDecimal getFractionAboveNormal() { 
          return this.fractionAboveNormal == null ? null : this.fractionAboveNormal.getValue();
        }

        /**
         * @param value Fraction of samples above normalized normal range.
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionAboveNormal(BigDecimal value) { 
          if (value == null)
            this.fractionAboveNormal = null;
          else {
            if (this.fractionAboveNormal == null)
              this.fractionAboveNormal = new DecimalType();
            this.fractionAboveNormal.setValue(value);
          }
          return this;
        }

        /**
         * @param value Fraction of samples above normalized normal range.
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionAboveNormal(long value) { 
              this.fractionAboveNormal = new DecimalType();
            this.fractionAboveNormal.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of samples above normalized normal range.
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionAboveNormal(double value) { 
              this.fractionAboveNormal = new DecimalType();
            this.fractionAboveNormal.setValue(value);
          return this;
        }

        /**
         * @return {@link #fractionBelowNormal} (Fraction of samples below normalized normal range.). This is the underlying object with id, value and extensions. The accessor "getFractionBelowNormal" gives direct access to the value
         */
        public DecimalType getFractionBelowNormalElement() { 
          if (this.fractionBelowNormal == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.fractionBelowNormal");
            else if (Configuration.doAutoCreate())
              this.fractionBelowNormal = new DecimalType(); // bb
          return this.fractionBelowNormal;
        }

        public boolean hasFractionBelowNormalElement() { 
          return this.fractionBelowNormal != null && !this.fractionBelowNormal.isEmpty();
        }

        public boolean hasFractionBelowNormal() { 
          return this.fractionBelowNormal != null && !this.fractionBelowNormal.isEmpty();
        }

        /**
         * @param value {@link #fractionBelowNormal} (Fraction of samples below normalized normal range.). This is the underlying object with id, value and extensions. The accessor "getFractionBelowNormal" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionBelowNormalElement(DecimalType value) { 
          this.fractionBelowNormal = value;
          return this;
        }

        /**
         * @return Fraction of samples below normalized normal range.
         */
        public BigDecimal getFractionBelowNormal() { 
          return this.fractionBelowNormal == null ? null : this.fractionBelowNormal.getValue();
        }

        /**
         * @param value Fraction of samples below normalized normal range.
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionBelowNormal(BigDecimal value) { 
          if (value == null)
            this.fractionBelowNormal = null;
          else {
            if (this.fractionBelowNormal == null)
              this.fractionBelowNormal = new DecimalType();
            this.fractionBelowNormal.setValue(value);
          }
          return this;
        }

        /**
         * @param value Fraction of samples below normalized normal range.
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionBelowNormal(long value) { 
              this.fractionBelowNormal = new DecimalType();
            this.fractionBelowNormal.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of samples below normalized normal range.
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionBelowNormal(double value) { 
              this.fractionBelowNormal = new DecimalType();
            this.fractionBelowNormal.setValue(value);
          return this;
        }

        /**
         * @return {@link #correlatedLabs} (An ordered list of the laboratory tests defined in the profile definition that are most closely correlated.  This list can be limited by the top "n" labs and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent getCorrelatedLabs() { 
          if (this.correlatedLabs == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.correlatedLabs");
            else if (Configuration.doAutoCreate())
              this.correlatedLabs = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent(); // cc
          return this.correlatedLabs;
        }

        public boolean hasCorrelatedLabs() { 
          return this.correlatedLabs != null && !this.correlatedLabs.isEmpty();
        }

        /**
         * @param value {@link #correlatedLabs} (An ordered list of the laboratory tests defined in the profile definition that are most closely correlated.  This list can be limited by the top "n" labs and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionComponent setCorrelatedLabs(ClinicalProfileLabScalarDistributionCorrelatedLabsComponent value) { 
          this.correlatedLabs = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("units", "SimpleQuantity", "Units of numeric result -- this is not actually a quantity… value is not allowed.", 0, 1, units));
          children.add(new Property("min", "decimal", "The minimum value of this lab for all of the patients in this cohort.", 0, 1, min));
          children.add(new Property("max", "decimal", "The maximum value of this lab for all of the patients in this cohort.", 0, 1, max));
          children.add(new Property("mean", "decimal", "The mean or average value for all of the patients in this cohort.", 0, 1, mean));
          children.add(new Property("median", "decimal", "The median value for all of the patients in this cohort.", 0, 1, median));
          children.add(new Property("stdDev", "decimal", "The standard deviation for all of the patients in this cohort.", 0, 1, stdDev));
          children.add(new Property("decile", "", "Decile partitions.", 0, java.lang.Integer.MAX_VALUE, decile));
          children.add(new Property("normalizedHigh", "decimal", "The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.", 0, 1, normalizedHigh));
          children.add(new Property("normalizedLow", "decimal", "The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.", 0, 1, normalizedLow));
          children.add(new Property("fractionAboveNormal", "decimal", "Fraction of samples above normalized normal range.", 0, 1, fractionAboveNormal));
          children.add(new Property("fractionBelowNormal", "decimal", "Fraction of samples below normalized normal range.", 0, 1, fractionBelowNormal));
          children.add(new Property("correlatedLabs", "", "An ordered list of the laboratory tests defined in the profile definition that are most closely correlated.  This list can be limited by the top \"n\" labs and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedLabs));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 111433583: /*units*/  return new Property("units", "SimpleQuantity", "Units of numeric result -- this is not actually a quantity… value is not allowed.", 0, 1, units);
          case 108114: /*min*/  return new Property("min", "decimal", "The minimum value of this lab for all of the patients in this cohort.", 0, 1, min);
          case 107876: /*max*/  return new Property("max", "decimal", "The maximum value of this lab for all of the patients in this cohort.", 0, 1, max);
          case 3347397: /*mean*/  return new Property("mean", "decimal", "The mean or average value for all of the patients in this cohort.", 0, 1, mean);
          case -1078031094: /*median*/  return new Property("median", "decimal", "The median value for all of the patients in this cohort.", 0, 1, median);
          case -892438798: /*stdDev*/  return new Property("stdDev", "decimal", "The standard deviation for all of the patients in this cohort.", 0, 1, stdDev);
          case -1335722912: /*decile*/  return new Property("decile", "", "Decile partitions.", 0, java.lang.Integer.MAX_VALUE, decile);
          case -363101895: /*normalizedHigh*/  return new Property("normalizedHigh", "decimal", "The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.", 0, 1, normalizedHigh);
          case -1397182243: /*normalizedLow*/  return new Property("normalizedLow", "decimal", "The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.", 0, 1, normalizedLow);
          case 1125045122: /*fractionAboveNormal*/  return new Property("fractionAboveNormal", "decimal", "Fraction of samples above normalized normal range.", 0, 1, fractionAboveNormal);
          case -653624042: /*fractionBelowNormal*/  return new Property("fractionBelowNormal", "decimal", "Fraction of samples below normalized normal range.", 0, 1, fractionBelowNormal);
          case 1929642507: /*correlatedLabs*/  return new Property("correlatedLabs", "", "An ordered list of the laboratory tests defined in the profile definition that are most closely correlated.  This list can be limited by the top \"n\" labs and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedLabs);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 111433583: /*units*/ return this.units == null ? new Base[0] : new Base[] {this.units}; // Quantity
        case 108114: /*min*/ return this.min == null ? new Base[0] : new Base[] {this.min}; // DecimalType
        case 107876: /*max*/ return this.max == null ? new Base[0] : new Base[] {this.max}; // DecimalType
        case 3347397: /*mean*/ return this.mean == null ? new Base[0] : new Base[] {this.mean}; // DecimalType
        case -1078031094: /*median*/ return this.median == null ? new Base[0] : new Base[] {this.median}; // DecimalType
        case -892438798: /*stdDev*/ return this.stdDev == null ? new Base[0] : new Base[] {this.stdDev}; // DecimalType
        case -1335722912: /*decile*/ return this.decile == null ? new Base[0] : this.decile.toArray(new Base[this.decile.size()]); // ClinicalProfileLabScalarDistributionDecileComponent
        case -363101895: /*normalizedHigh*/ return this.normalizedHigh == null ? new Base[0] : new Base[] {this.normalizedHigh}; // DecimalType
        case -1397182243: /*normalizedLow*/ return this.normalizedLow == null ? new Base[0] : new Base[] {this.normalizedLow}; // DecimalType
        case 1125045122: /*fractionAboveNormal*/ return this.fractionAboveNormal == null ? new Base[0] : new Base[] {this.fractionAboveNormal}; // DecimalType
        case -653624042: /*fractionBelowNormal*/ return this.fractionBelowNormal == null ? new Base[0] : new Base[] {this.fractionBelowNormal}; // DecimalType
        case 1929642507: /*correlatedLabs*/ return this.correlatedLabs == null ? new Base[0] : new Base[] {this.correlatedLabs}; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 111433583: // units
          this.units = castToQuantity(value); // Quantity
          return value;
        case 108114: // min
          this.min = castToDecimal(value); // DecimalType
          return value;
        case 107876: // max
          this.max = castToDecimal(value); // DecimalType
          return value;
        case 3347397: // mean
          this.mean = castToDecimal(value); // DecimalType
          return value;
        case -1078031094: // median
          this.median = castToDecimal(value); // DecimalType
          return value;
        case -892438798: // stdDev
          this.stdDev = castToDecimal(value); // DecimalType
          return value;
        case -1335722912: // decile
          this.getDecile().add((ClinicalProfileLabScalarDistributionDecileComponent) value); // ClinicalProfileLabScalarDistributionDecileComponent
          return value;
        case -363101895: // normalizedHigh
          this.normalizedHigh = castToDecimal(value); // DecimalType
          return value;
        case -1397182243: // normalizedLow
          this.normalizedLow = castToDecimal(value); // DecimalType
          return value;
        case 1125045122: // fractionAboveNormal
          this.fractionAboveNormal = castToDecimal(value); // DecimalType
          return value;
        case -653624042: // fractionBelowNormal
          this.fractionBelowNormal = castToDecimal(value); // DecimalType
          return value;
        case 1929642507: // correlatedLabs
          this.correlatedLabs = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("units")) {
          this.units = castToQuantity(value); // Quantity
        } else if (name.equals("min")) {
          this.min = castToDecimal(value); // DecimalType
        } else if (name.equals("max")) {
          this.max = castToDecimal(value); // DecimalType
        } else if (name.equals("mean")) {
          this.mean = castToDecimal(value); // DecimalType
        } else if (name.equals("median")) {
          this.median = castToDecimal(value); // DecimalType
        } else if (name.equals("stdDev")) {
          this.stdDev = castToDecimal(value); // DecimalType
        } else if (name.equals("decile")) {
          this.getDecile().add((ClinicalProfileLabScalarDistributionDecileComponent) value);
        } else if (name.equals("normalizedHigh")) {
          this.normalizedHigh = castToDecimal(value); // DecimalType
        } else if (name.equals("normalizedLow")) {
          this.normalizedLow = castToDecimal(value); // DecimalType
        } else if (name.equals("fractionAboveNormal")) {
          this.fractionAboveNormal = castToDecimal(value); // DecimalType
        } else if (name.equals("fractionBelowNormal")) {
          this.fractionBelowNormal = castToDecimal(value); // DecimalType
        } else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 111433583:  return getUnits(); 
        case 108114:  return getMinElement();
        case 107876:  return getMaxElement();
        case 3347397:  return getMeanElement();
        case -1078031094:  return getMedianElement();
        case -892438798:  return getStdDevElement();
        case -1335722912:  return addDecile(); 
        case -363101895:  return getNormalizedHighElement();
        case -1397182243:  return getNormalizedLowElement();
        case 1125045122:  return getFractionAboveNormalElement();
        case -653624042:  return getFractionBelowNormalElement();
        case 1929642507:  return getCorrelatedLabs(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 111433583: /*units*/ return new String[] {"SimpleQuantity"};
        case 108114: /*min*/ return new String[] {"decimal"};
        case 107876: /*max*/ return new String[] {"decimal"};
        case 3347397: /*mean*/ return new String[] {"decimal"};
        case -1078031094: /*median*/ return new String[] {"decimal"};
        case -892438798: /*stdDev*/ return new String[] {"decimal"};
        case -1335722912: /*decile*/ return new String[] {};
        case -363101895: /*normalizedHigh*/ return new String[] {"decimal"};
        case -1397182243: /*normalizedLow*/ return new String[] {"decimal"};
        case 1125045122: /*fractionAboveNormal*/ return new String[] {"decimal"};
        case -653624042: /*fractionBelowNormal*/ return new String[] {"decimal"};
        case 1929642507: /*correlatedLabs*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("units")) {
          this.units = new Quantity();
          return this.units;
        }
        else if (name.equals("min")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.min");
        }
        else if (name.equals("max")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.max");
        }
        else if (name.equals("mean")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.mean");
        }
        else if (name.equals("median")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.median");
        }
        else if (name.equals("stdDev")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.stdDev");
        }
        else if (name.equals("decile")) {
          return addDecile();
        }
        else if (name.equals("normalizedHigh")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.normalizedHigh");
        }
        else if (name.equals("normalizedLow")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.normalizedLow");
        }
        else if (name.equals("fractionAboveNormal")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionAboveNormal");
        }
        else if (name.equals("fractionBelowNormal")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionBelowNormal");
        }
        else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent();
          return this.correlatedLabs;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionComponent copy() {
        ClinicalProfileLabScalarDistributionComponent dst = new ClinicalProfileLabScalarDistributionComponent();
        copyValues(dst);
        dst.units = units == null ? null : units.copy();
        dst.min = min == null ? null : min.copy();
        dst.max = max == null ? null : max.copy();
        dst.mean = mean == null ? null : mean.copy();
        dst.median = median == null ? null : median.copy();
        dst.stdDev = stdDev == null ? null : stdDev.copy();
        if (decile != null) {
          dst.decile = new ArrayList<ClinicalProfileLabScalarDistributionDecileComponent>();
          for (ClinicalProfileLabScalarDistributionDecileComponent i : decile)
            dst.decile.add(i.copy());
        };
        dst.normalizedHigh = normalizedHigh == null ? null : normalizedHigh.copy();
        dst.normalizedLow = normalizedLow == null ? null : normalizedLow.copy();
        dst.fractionAboveNormal = fractionAboveNormal == null ? null : fractionAboveNormal.copy();
        dst.fractionBelowNormal = fractionBelowNormal == null ? null : fractionBelowNormal.copy();
        dst.correlatedLabs = correlatedLabs == null ? null : correlatedLabs.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionComponent))
          return false;
        ClinicalProfileLabScalarDistributionComponent o = (ClinicalProfileLabScalarDistributionComponent) other_;
        return compareDeep(units, o.units, true) && compareDeep(min, o.min, true) && compareDeep(max, o.max, true)
           && compareDeep(mean, o.mean, true) && compareDeep(median, o.median, true) && compareDeep(stdDev, o.stdDev, true)
           && compareDeep(decile, o.decile, true) && compareDeep(normalizedHigh, o.normalizedHigh, true) && compareDeep(normalizedLow, o.normalizedLow, true)
           && compareDeep(fractionAboveNormal, o.fractionAboveNormal, true) && compareDeep(fractionBelowNormal, o.fractionBelowNormal, true)
           && compareDeep(correlatedLabs, o.correlatedLabs, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionComponent))
          return false;
        ClinicalProfileLabScalarDistributionComponent o = (ClinicalProfileLabScalarDistributionComponent) other_;
        return compareValues(min, o.min, true) && compareValues(max, o.max, true) && compareValues(mean, o.mean, true)
           && compareValues(median, o.median, true) && compareValues(stdDev, o.stdDev, true) && compareValues(normalizedHigh, o.normalizedHigh, true)
           && compareValues(normalizedLow, o.normalizedLow, true) && compareValues(fractionAboveNormal, o.fractionAboveNormal, true)
           && compareValues(fractionBelowNormal, o.fractionBelowNormal, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(units, min, max, mean
          , median, stdDev, decile, normalizedHigh, normalizedLow, fractionAboveNormal, fractionBelowNormal
          , correlatedLabs);
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionDecileComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Particular decile (10, 20, …).
         */
        @Child(name = "nth", type = {IntegerType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Particular decile (10, 20, …)", formalDefinition="Particular decile (10, 20, …)." )
        protected IntegerType nth;

        /**
         * Cutoff value for this decile.
         */
        @Child(name = "value", type = {DecimalType.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Cutoff value for this decile", formalDefinition="Cutoff value for this decile." )
        protected DecimalType value;

        private static final long serialVersionUID = 508367230L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionDecileComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionDecileComponent(IntegerType nth, DecimalType value) {
        super();
        this.nth = nth;
        this.value = value;
      }

        /**
         * @return {@link #nth} (Particular decile (10, 20, …).). This is the underlying object with id, value and extensions. The accessor "getNth" gives direct access to the value
         */
        public IntegerType getNthElement() { 
          if (this.nth == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionDecileComponent.nth");
            else if (Configuration.doAutoCreate())
              this.nth = new IntegerType(); // bb
          return this.nth;
        }

        public boolean hasNthElement() { 
          return this.nth != null && !this.nth.isEmpty();
        }

        public boolean hasNth() { 
          return this.nth != null && !this.nth.isEmpty();
        }

        /**
         * @param value {@link #nth} (Particular decile (10, 20, …).). This is the underlying object with id, value and extensions. The accessor "getNth" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionDecileComponent setNthElement(IntegerType value) { 
          this.nth = value;
          return this;
        }

        /**
         * @return Particular decile (10, 20, …).
         */
        public int getNth() { 
          return this.nth == null || this.nth.isEmpty() ? 0 : this.nth.getValue();
        }

        /**
         * @param value Particular decile (10, 20, …).
         */
        public ClinicalProfileLabScalarDistributionDecileComponent setNth(int value) { 
            if (this.nth == null)
              this.nth = new IntegerType();
            this.nth.setValue(value);
          return this;
        }

        /**
         * @return {@link #value} (Cutoff value for this decile.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
         */
        public DecimalType getValueElement() { 
          if (this.value == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionDecileComponent.value");
            else if (Configuration.doAutoCreate())
              this.value = new DecimalType(); // bb
          return this.value;
        }

        public boolean hasValueElement() { 
          return this.value != null && !this.value.isEmpty();
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (Cutoff value for this decile.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionDecileComponent setValueElement(DecimalType value) { 
          this.value = value;
          return this;
        }

        /**
         * @return Cutoff value for this decile.
         */
        public BigDecimal getValue() { 
          return this.value == null ? null : this.value.getValue();
        }

        /**
         * @param value Cutoff value for this decile.
         */
        public ClinicalProfileLabScalarDistributionDecileComponent setValue(BigDecimal value) { 
            if (this.value == null)
              this.value = new DecimalType();
            this.value.setValue(value);
          return this;
        }

        /**
         * @param value Cutoff value for this decile.
         */
        public ClinicalProfileLabScalarDistributionDecileComponent setValue(long value) { 
              this.value = new DecimalType();
            this.value.setValue(value);
          return this;
        }

        /**
         * @param value Cutoff value for this decile.
         */
        public ClinicalProfileLabScalarDistributionDecileComponent setValue(double value) { 
              this.value = new DecimalType();
            this.value.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("nth", "integer", "Particular decile (10, 20, …).", 0, 1, nth));
          children.add(new Property("value", "decimal", "Cutoff value for this decile.", 0, 1, value));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 109410: /*nth*/  return new Property("nth", "integer", "Particular decile (10, 20, …).", 0, 1, nth);
          case 111972721: /*value*/  return new Property("value", "decimal", "Cutoff value for this decile.", 0, 1, value);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 109410: /*nth*/ return this.nth == null ? new Base[0] : new Base[] {this.nth}; // IntegerType
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 109410: // nth
          this.nth = castToInteger(value); // IntegerType
          return value;
        case 111972721: // value
          this.value = castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("nth")) {
          this.nth = castToInteger(value); // IntegerType
        } else if (name.equals("value")) {
          this.value = castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 109410:  return getNthElement();
        case 111972721:  return getValueElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 109410: /*nth*/ return new String[] {"integer"};
        case 111972721: /*value*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("nth")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.nth");
        }
        else if (name.equals("value")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.value");
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionDecileComponent copy() {
        ClinicalProfileLabScalarDistributionDecileComponent dst = new ClinicalProfileLabScalarDistributionDecileComponent();
        copyValues(dst);
        dst.nth = nth == null ? null : nth.copy();
        dst.value = value == null ? null : value.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionDecileComponent))
          return false;
        ClinicalProfileLabScalarDistributionDecileComponent o = (ClinicalProfileLabScalarDistributionDecileComponent) other_;
        return compareDeep(nth, o.nth, true) && compareDeep(value, o.value, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionDecileComponent))
          return false;
        ClinicalProfileLabScalarDistributionDecileComponent o = (ClinicalProfileLabScalarDistributionDecileComponent) other_;
        return compareValues(nth, o.nth, true) && compareValues(value, o.value, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(nth, value);
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.decile";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionCorrelatedLabsComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Number of correlations cutoff (e.g. top 10).
         */
        @Child(name = "topn", type = {IntegerType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Number of correlations cutoff (e.g. top 10)", formalDefinition="Number of correlations cutoff (e.g. top 10)." )
        protected IntegerType topn;

        /**
         * Minimum absolute value of correlation coefficient.
         */
        @Child(name = "abscorrelation", type = {DecimalType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Minimum absolute value of correlation coefficient", formalDefinition="Minimum absolute value of correlation coefficient." )
        protected DecimalType abscorrelation;

        /**
         * Correlated lab.
         */
        @Child(name = "entry", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Correlated lab", formalDefinition="Correlated lab." )
        protected List<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent> entry;

        private static final long serialVersionUID = 16637493L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent() {
        super();
      }

        /**
         * @return {@link #topn} (Number of correlations cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public IntegerType getTopnElement() { 
          if (this.topn == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedLabsComponent.topn");
            else if (Configuration.doAutoCreate())
              this.topn = new IntegerType(); // bb
          return this.topn;
        }

        public boolean hasTopnElement() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        public boolean hasTopn() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        /**
         * @param value {@link #topn} (Number of correlations cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setTopnElement(IntegerType value) { 
          this.topn = value;
          return this;
        }

        /**
         * @return Number of correlations cutoff (e.g. top 10).
         */
        public int getTopn() { 
          return this.topn == null || this.topn.isEmpty() ? 0 : this.topn.getValue();
        }

        /**
         * @param value Number of correlations cutoff (e.g. top 10).
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setTopn(int value) { 
            if (this.topn == null)
              this.topn = new IntegerType();
            this.topn.setValue(value);
          return this;
        }

        /**
         * @return {@link #abscorrelation} (Minimum absolute value of correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getAbscorrelation" gives direct access to the value
         */
        public DecimalType getAbscorrelationElement() { 
          if (this.abscorrelation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedLabsComponent.abscorrelation");
            else if (Configuration.doAutoCreate())
              this.abscorrelation = new DecimalType(); // bb
          return this.abscorrelation;
        }

        public boolean hasAbscorrelationElement() { 
          return this.abscorrelation != null && !this.abscorrelation.isEmpty();
        }

        public boolean hasAbscorrelation() { 
          return this.abscorrelation != null && !this.abscorrelation.isEmpty();
        }

        /**
         * @param value {@link #abscorrelation} (Minimum absolute value of correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getAbscorrelation" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setAbscorrelationElement(DecimalType value) { 
          this.abscorrelation = value;
          return this;
        }

        /**
         * @return Minimum absolute value of correlation coefficient.
         */
        public BigDecimal getAbscorrelation() { 
          return this.abscorrelation == null ? null : this.abscorrelation.getValue();
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setAbscorrelation(BigDecimal value) { 
          if (value == null)
            this.abscorrelation = null;
          else {
            if (this.abscorrelation == null)
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          }
          return this;
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setAbscorrelation(long value) { 
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          return this;
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setAbscorrelation(double value) { 
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          return this;
        }

        /**
         * @return {@link #entry} (Correlated lab.)
         */
        public List<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent> getEntry() { 
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent>();
          return this.entry;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setEntry(List<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent> theEntry) { 
          this.entry = theEntry;
          return this;
        }

        public boolean hasEntry() { 
          if (this.entry == null)
            return false;
          for (ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent item : this.entry)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent addEntry() { //3
          ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent t = new ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent();
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent>();
          this.entry.add(t);
          return t;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent addEntry(ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent t) { //3
          if (t == null)
            return this;
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent>();
          this.entry.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #entry}, creating it if it does not already exist
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent getEntryFirstRep() { 
          if (getEntry().isEmpty()) {
            addEntry();
          }
          return getEntry().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("topn", "integer", "Number of correlations cutoff (e.g. top 10).", 0, 1, topn));
          children.add(new Property("abscorrelation", "decimal", "Minimum absolute value of correlation coefficient.", 0, 1, abscorrelation));
          children.add(new Property("entry", "", "Correlated lab.", 0, java.lang.Integer.MAX_VALUE, entry));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3566009: /*topn*/  return new Property("topn", "integer", "Number of correlations cutoff (e.g. top 10).", 0, 1, topn);
          case -1112161840: /*abscorrelation*/  return new Property("abscorrelation", "decimal", "Minimum absolute value of correlation coefficient.", 0, 1, abscorrelation);
          case 96667762: /*entry*/  return new Property("entry", "", "Correlated lab.", 0, java.lang.Integer.MAX_VALUE, entry);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return this.topn == null ? new Base[0] : new Base[] {this.topn}; // IntegerType
        case -1112161840: /*abscorrelation*/ return this.abscorrelation == null ? new Base[0] : new Base[] {this.abscorrelation}; // DecimalType
        case 96667762: /*entry*/ return this.entry == null ? new Base[0] : this.entry.toArray(new Base[this.entry.size()]); // ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3566009: // topn
          this.topn = castToInteger(value); // IntegerType
          return value;
        case -1112161840: // abscorrelation
          this.abscorrelation = castToDecimal(value); // DecimalType
          return value;
        case 96667762: // entry
          this.getEntry().add((ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent) value); // ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("topn")) {
          this.topn = castToInteger(value); // IntegerType
        } else if (name.equals("abscorrelation")) {
          this.abscorrelation = castToDecimal(value); // DecimalType
        } else if (name.equals("entry")) {
          this.getEntry().add((ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009:  return getTopnElement();
        case -1112161840:  return getAbscorrelationElement();
        case 96667762:  return addEntry(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return new String[] {"integer"};
        case -1112161840: /*abscorrelation*/ return new String[] {"decimal"};
        case 96667762: /*entry*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("topn")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.topn");
        }
        else if (name.equals("abscorrelation")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.abscorrelation");
        }
        else if (name.equals("entry")) {
          return addEntry();
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent copy() {
        ClinicalProfileLabScalarDistributionCorrelatedLabsComponent dst = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent();
        copyValues(dst);
        dst.topn = topn == null ? null : topn.copy();
        dst.abscorrelation = abscorrelation == null ? null : abscorrelation.copy();
        if (entry != null) {
          dst.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent>();
          for (ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent i : entry)
            dst.entry.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedLabsComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedLabsComponent o = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) other_;
        return compareDeep(topn, o.topn, true) && compareDeep(abscorrelation, o.abscorrelation, true) && compareDeep(entry, o.entry, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedLabsComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedLabsComponent o = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) other_;
        return compareValues(topn, o.topn, true) && compareValues(abscorrelation, o.abscorrelation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(topn, abscorrelation, entry
          );
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.correlatedLabs";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Lab code (LOINC) or Lab Group Code.
         */
        @Child(name = "labcode", type = {CodeableConcept.class}, order=1, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Lab code (LOINC) or Lab Group Code", formalDefinition="Lab code (LOINC) or Lab Group Code." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/observation-codes")
        protected List<CodeableConcept> labcode;

        /**
         * Correlation coefficient.
         */
        @Child(name = "coefficient", type = {DecimalType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Correlation coefficient", formalDefinition="Correlation coefficient." )
        protected DecimalType coefficient;

        private static final long serialVersionUID = 119903199L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent(DecimalType coefficient) {
        super();
        this.coefficient = coefficient;
      }

        /**
         * @return {@link #labcode} (Lab code (LOINC) or Lab Group Code.)
         */
        public List<CodeableConcept> getLabcode() { 
          if (this.labcode == null)
            this.labcode = new ArrayList<CodeableConcept>();
          return this.labcode;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent setLabcode(List<CodeableConcept> theLabcode) { 
          this.labcode = theLabcode;
          return this;
        }

        public boolean hasLabcode() { 
          if (this.labcode == null)
            return false;
          for (CodeableConcept item : this.labcode)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addLabcode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.labcode == null)
            this.labcode = new ArrayList<CodeableConcept>();
          this.labcode.add(t);
          return t;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent addLabcode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.labcode == null)
            this.labcode = new ArrayList<CodeableConcept>();
          this.labcode.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #labcode}, creating it if it does not already exist
         */
        public CodeableConcept getLabcodeFirstRep() { 
          if (getLabcode().isEmpty()) {
            addLabcode();
          }
          return getLabcode().get(0);
        }

        /**
         * @return {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public DecimalType getCoefficientElement() { 
          if (this.coefficient == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent.coefficient");
            else if (Configuration.doAutoCreate())
              this.coefficient = new DecimalType(); // bb
          return this.coefficient;
        }

        public boolean hasCoefficientElement() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        public boolean hasCoefficient() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        /**
         * @param value {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent setCoefficientElement(DecimalType value) { 
          this.coefficient = value;
          return this;
        }

        /**
         * @return Correlation coefficient.
         */
        public BigDecimal getCoefficient() { 
          return this.coefficient == null ? null : this.coefficient.getValue();
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent setCoefficient(BigDecimal value) { 
            if (this.coefficient == null)
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent setCoefficient(long value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent setCoefficient(double value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("labcode", "CodeableConcept", "Lab code (LOINC) or Lab Group Code.", 0, java.lang.Integer.MAX_VALUE, labcode));
          children.add(new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -63258374: /*labcode*/  return new Property("labcode", "CodeableConcept", "Lab code (LOINC) or Lab Group Code.", 0, java.lang.Integer.MAX_VALUE, labcode);
          case 797813045: /*coefficient*/  return new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -63258374: /*labcode*/ return this.labcode == null ? new Base[0] : this.labcode.toArray(new Base[this.labcode.size()]); // CodeableConcept
        case 797813045: /*coefficient*/ return this.coefficient == null ? new Base[0] : new Base[] {this.coefficient}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -63258374: // labcode
          this.getLabcode().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 797813045: // coefficient
          this.coefficient = castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("labcode")) {
          this.getLabcode().add(castToCodeableConcept(value));
        } else if (name.equals("coefficient")) {
          this.coefficient = castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -63258374:  return addLabcode(); 
        case 797813045:  return getCoefficientElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -63258374: /*labcode*/ return new String[] {"CodeableConcept"};
        case 797813045: /*coefficient*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("labcode")) {
          return addLabcode();
        }
        else if (name.equals("coefficient")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.coefficient");
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent copy() {
        ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent dst = new ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent();
        copyValues(dst);
        if (labcode != null) {
          dst.labcode = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : labcode)
            dst.labcode.add(i.copy());
        };
        dst.coefficient = coefficient == null ? null : coefficient.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent o = (ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent) other_;
        return compareDeep(labcode, o.labcode, true) && compareDeep(coefficient, o.coefficient, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent o = (ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent) other_;
        return compareValues(coefficient, o.coefficient, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(labcode, coefficient);
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.correlatedLabs.entry";

  }

  }

    @Block()
    public static class ClinicalProfileMedicationComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Medication(s) being profiled.
         */
        @Child(name = "medication", type = {CodeableConcept.class, Medication.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Medication(s) being profiled", formalDefinition="Medication(s) being profiled." )
        protected Type medication;

        /**
         * Details of how medication was taken.
         */
        @Child(name = "dosage", type = {}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Details of how medication was taken", formalDefinition="Details of how medication was taken." )
        protected ClinicalProfileMedicationDosageComponent dosage;

        /**
         * Needs clarification.
         */
        @Child(name = "treatementDuration", type = {DecimalType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Duration of treatment (in 1 year)", formalDefinition="Needs clarification." )
        protected DecimalType treatementDuration;

        /**
         * Fraction of patients in cohort treated with this drug.
         */
        @Child(name = "fractionOfSubjects", type = {DecimalType.class}, order=4, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Fraction of patients in cohort treated with this drug", formalDefinition="Fraction of patients in cohort treated with this drug." )
        protected DecimalType fractionOfSubjects;

        /**
         * An ordered list of the laboratory tests defined in the profile definition that have the most significant deviation relative value.  This list can be limited by the top "n" labs and/or a cutoff on the absolute value of the deviation.
         */
        @Child(name = "correlatedLabs", type = {}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The top labs with the most significant deviation relative value", formalDefinition="An ordered list of the laboratory tests defined in the profile definition that have the most significant deviation relative value.  This list can be limited by the top \"n\" labs and/or a cutoff on the absolute value of the deviation." )
        protected ClinicalProfileMedicationCorrelatedLabsComponent correlatedLabs;

        private static final long serialVersionUID = -1012725966L;

    /**
     * Constructor
     */
      public ClinicalProfileMedicationComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileMedicationComponent(Type medication, DecimalType fractionOfSubjects) {
        super();
        this.medication = medication;
        this.fractionOfSubjects = fractionOfSubjects;
      }

        /**
         * @return {@link #medication} (Medication(s) being profiled.)
         */
        public Type getMedication() { 
          return this.medication;
        }

        /**
         * @return {@link #medication} (Medication(s) being profiled.)
         */
        public CodeableConcept getMedicationCodeableConcept() throws FHIRException { 
          if (this.medication == null)
            this.medication = new CodeableConcept();
          if (!(this.medication instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "+this.medication.getClass().getName()+" was encountered");
          return (CodeableConcept) this.medication;
        }

        public boolean hasMedicationCodeableConcept() { 
          return this != null && this.medication instanceof CodeableConcept;
        }

        /**
         * @return {@link #medication} (Medication(s) being profiled.)
         */
        public Reference getMedicationReference() throws FHIRException { 
          if (this.medication == null)
            this.medication = new Reference();
          if (!(this.medication instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.medication.getClass().getName()+" was encountered");
          return (Reference) this.medication;
        }

        public boolean hasMedicationReference() { 
          return this != null && this.medication instanceof Reference;
        }

        public boolean hasMedication() { 
          return this.medication != null && !this.medication.isEmpty();
        }

        /**
         * @param value {@link #medication} (Medication(s) being profiled.)
         */
        public ClinicalProfileMedicationComponent setMedication(Type value) { 
          if (value != null && !(value instanceof CodeableConcept || value instanceof Reference))
            throw new Error("Not the right type for ClinicalProfile.medication.medication[x]: "+value.fhirType());
          this.medication = value;
          return this;
        }

        /**
         * @return {@link #dosage} (Details of how medication was taken.)
         */
        public ClinicalProfileMedicationDosageComponent getDosage() { 
          if (this.dosage == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.dosage");
            else if (Configuration.doAutoCreate())
              this.dosage = new ClinicalProfileMedicationDosageComponent(); // cc
          return this.dosage;
        }

        public boolean hasDosage() { 
          return this.dosage != null && !this.dosage.isEmpty();
        }

        /**
         * @param value {@link #dosage} (Details of how medication was taken.)
         */
        public ClinicalProfileMedicationComponent setDosage(ClinicalProfileMedicationDosageComponent value) { 
          this.dosage = value;
          return this;
        }

        /**
         * @return {@link #treatementDuration} (Needs clarification.). This is the underlying object with id, value and extensions. The accessor "getTreatementDuration" gives direct access to the value
         */
        public DecimalType getTreatementDurationElement() { 
          if (this.treatementDuration == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.treatementDuration");
            else if (Configuration.doAutoCreate())
              this.treatementDuration = new DecimalType(); // bb
          return this.treatementDuration;
        }

        public boolean hasTreatementDurationElement() { 
          return this.treatementDuration != null && !this.treatementDuration.isEmpty();
        }

        public boolean hasTreatementDuration() { 
          return this.treatementDuration != null && !this.treatementDuration.isEmpty();
        }

        /**
         * @param value {@link #treatementDuration} (Needs clarification.). This is the underlying object with id, value and extensions. The accessor "getTreatementDuration" gives direct access to the value
         */
        public ClinicalProfileMedicationComponent setTreatementDurationElement(DecimalType value) { 
          this.treatementDuration = value;
          return this;
        }

        /**
         * @return Needs clarification.
         */
        public BigDecimal getTreatementDuration() { 
          return this.treatementDuration == null ? null : this.treatementDuration.getValue();
        }

        /**
         * @param value Needs clarification.
         */
        public ClinicalProfileMedicationComponent setTreatementDuration(BigDecimal value) { 
          if (value == null)
            this.treatementDuration = null;
          else {
            if (this.treatementDuration == null)
              this.treatementDuration = new DecimalType();
            this.treatementDuration.setValue(value);
          }
          return this;
        }

        /**
         * @param value Needs clarification.
         */
        public ClinicalProfileMedicationComponent setTreatementDuration(long value) { 
              this.treatementDuration = new DecimalType();
            this.treatementDuration.setValue(value);
          return this;
        }

        /**
         * @param value Needs clarification.
         */
        public ClinicalProfileMedicationComponent setTreatementDuration(double value) { 
              this.treatementDuration = new DecimalType();
            this.treatementDuration.setValue(value);
          return this;
        }

        /**
         * @return {@link #fractionOfSubjects} (Fraction of patients in cohort treated with this drug.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public DecimalType getFractionOfSubjectsElement() { 
          if (this.fractionOfSubjects == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.fractionOfSubjects");
            else if (Configuration.doAutoCreate())
              this.fractionOfSubjects = new DecimalType(); // bb
          return this.fractionOfSubjects;
        }

        public boolean hasFractionOfSubjectsElement() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        public boolean hasFractionOfSubjects() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        /**
         * @param value {@link #fractionOfSubjects} (Fraction of patients in cohort treated with this drug.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public ClinicalProfileMedicationComponent setFractionOfSubjectsElement(DecimalType value) { 
          this.fractionOfSubjects = value;
          return this;
        }

        /**
         * @return Fraction of patients in cohort treated with this drug.
         */
        public BigDecimal getFractionOfSubjects() { 
          return this.fractionOfSubjects == null ? null : this.fractionOfSubjects.getValue();
        }

        /**
         * @param value Fraction of patients in cohort treated with this drug.
         */
        public ClinicalProfileMedicationComponent setFractionOfSubjects(BigDecimal value) { 
            if (this.fractionOfSubjects == null)
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of patients in cohort treated with this drug.
         */
        public ClinicalProfileMedicationComponent setFractionOfSubjects(long value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of patients in cohort treated with this drug.
         */
        public ClinicalProfileMedicationComponent setFractionOfSubjects(double value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @return {@link #correlatedLabs} (An ordered list of the laboratory tests defined in the profile definition that have the most significant deviation relative value.  This list can be limited by the top "n" labs and/or a cutoff on the absolute value of the deviation.)
         */
        public ClinicalProfileMedicationCorrelatedLabsComponent getCorrelatedLabs() { 
          if (this.correlatedLabs == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.correlatedLabs");
            else if (Configuration.doAutoCreate())
              this.correlatedLabs = new ClinicalProfileMedicationCorrelatedLabsComponent(); // cc
          return this.correlatedLabs;
        }

        public boolean hasCorrelatedLabs() { 
          return this.correlatedLabs != null && !this.correlatedLabs.isEmpty();
        }

        /**
         * @param value {@link #correlatedLabs} (An ordered list of the laboratory tests defined in the profile definition that have the most significant deviation relative value.  This list can be limited by the top "n" labs and/or a cutoff on the absolute value of the deviation.)
         */
        public ClinicalProfileMedicationComponent setCorrelatedLabs(ClinicalProfileMedicationCorrelatedLabsComponent value) { 
          this.correlatedLabs = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Medication(s) being profiled.", 0, 1, medication));
          children.add(new Property("dosage", "", "Details of how medication was taken.", 0, 1, dosage));
          children.add(new Property("treatementDuration", "decimal", "Needs clarification.", 0, 1, treatementDuration));
          children.add(new Property("fractionOfSubjects", "decimal", "Fraction of patients in cohort treated with this drug.", 0, 1, fractionOfSubjects));
          children.add(new Property("correlatedLabs", "", "An ordered list of the laboratory tests defined in the profile definition that have the most significant deviation relative value.  This list can be limited by the top \"n\" labs and/or a cutoff on the absolute value of the deviation.", 0, 1, correlatedLabs));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 1458402129: /*medication[x]*/  return new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Medication(s) being profiled.", 0, 1, medication);
          case 1998965455: /*medication*/  return new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Medication(s) being profiled.", 0, 1, medication);
          case -209845038: /*medicationCodeableConcept*/  return new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Medication(s) being profiled.", 0, 1, medication);
          case 2104315196: /*medicationReference*/  return new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Medication(s) being profiled.", 0, 1, medication);
          case -1326018889: /*dosage*/  return new Property("dosage", "", "Details of how medication was taken.", 0, 1, dosage);
          case 858625053: /*treatementDuration*/  return new Property("treatementDuration", "decimal", "Needs clarification.", 0, 1, treatementDuration);
          case -254443680: /*fractionOfSubjects*/  return new Property("fractionOfSubjects", "decimal", "Fraction of patients in cohort treated with this drug.", 0, 1, fractionOfSubjects);
          case 1929642507: /*correlatedLabs*/  return new Property("correlatedLabs", "", "An ordered list of the laboratory tests defined in the profile definition that have the most significant deviation relative value.  This list can be limited by the top \"n\" labs and/or a cutoff on the absolute value of the deviation.", 0, 1, correlatedLabs);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 1998965455: /*medication*/ return this.medication == null ? new Base[0] : new Base[] {this.medication}; // Type
        case -1326018889: /*dosage*/ return this.dosage == null ? new Base[0] : new Base[] {this.dosage}; // ClinicalProfileMedicationDosageComponent
        case 858625053: /*treatementDuration*/ return this.treatementDuration == null ? new Base[0] : new Base[] {this.treatementDuration}; // DecimalType
        case -254443680: /*fractionOfSubjects*/ return this.fractionOfSubjects == null ? new Base[0] : new Base[] {this.fractionOfSubjects}; // DecimalType
        case 1929642507: /*correlatedLabs*/ return this.correlatedLabs == null ? new Base[0] : new Base[] {this.correlatedLabs}; // ClinicalProfileMedicationCorrelatedLabsComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 1998965455: // medication
          this.medication = castToType(value); // Type
          return value;
        case -1326018889: // dosage
          this.dosage = (ClinicalProfileMedicationDosageComponent) value; // ClinicalProfileMedicationDosageComponent
          return value;
        case 858625053: // treatementDuration
          this.treatementDuration = castToDecimal(value); // DecimalType
          return value;
        case -254443680: // fractionOfSubjects
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
          return value;
        case 1929642507: // correlatedLabs
          this.correlatedLabs = (ClinicalProfileMedicationCorrelatedLabsComponent) value; // ClinicalProfileMedicationCorrelatedLabsComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("medication[x]")) {
          this.medication = castToType(value); // Type
        } else if (name.equals("dosage")) {
          this.dosage = (ClinicalProfileMedicationDosageComponent) value; // ClinicalProfileMedicationDosageComponent
        } else if (name.equals("treatementDuration")) {
          this.treatementDuration = castToDecimal(value); // DecimalType
        } else if (name.equals("fractionOfSubjects")) {
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
        } else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = (ClinicalProfileMedicationCorrelatedLabsComponent) value; // ClinicalProfileMedicationCorrelatedLabsComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1458402129:  return getMedication(); 
        case 1998965455:  return getMedication(); 
        case -1326018889:  return getDosage(); 
        case 858625053:  return getTreatementDurationElement();
        case -254443680:  return getFractionOfSubjectsElement();
        case 1929642507:  return getCorrelatedLabs(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1998965455: /*medication*/ return new String[] {"CodeableConcept", "Reference"};
        case -1326018889: /*dosage*/ return new String[] {};
        case 858625053: /*treatementDuration*/ return new String[] {"decimal"};
        case -254443680: /*fractionOfSubjects*/ return new String[] {"decimal"};
        case 1929642507: /*correlatedLabs*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("medicationCodeableConcept")) {
          this.medication = new CodeableConcept();
          return this.medication;
        }
        else if (name.equals("medicationReference")) {
          this.medication = new Reference();
          return this.medication;
        }
        else if (name.equals("dosage")) {
          this.dosage = new ClinicalProfileMedicationDosageComponent();
          return this.dosage;
        }
        else if (name.equals("treatementDuration")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.treatementDuration");
        }
        else if (name.equals("fractionOfSubjects")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionOfSubjects");
        }
        else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = new ClinicalProfileMedicationCorrelatedLabsComponent();
          return this.correlatedLabs;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileMedicationComponent copy() {
        ClinicalProfileMedicationComponent dst = new ClinicalProfileMedicationComponent();
        copyValues(dst);
        dst.medication = medication == null ? null : medication.copy();
        dst.dosage = dosage == null ? null : dosage.copy();
        dst.treatementDuration = treatementDuration == null ? null : treatementDuration.copy();
        dst.fractionOfSubjects = fractionOfSubjects == null ? null : fractionOfSubjects.copy();
        dst.correlatedLabs = correlatedLabs == null ? null : correlatedLabs.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileMedicationComponent))
          return false;
        ClinicalProfileMedicationComponent o = (ClinicalProfileMedicationComponent) other_;
        return compareDeep(medication, o.medication, true) && compareDeep(dosage, o.dosage, true) && compareDeep(treatementDuration, o.treatementDuration, true)
           && compareDeep(fractionOfSubjects, o.fractionOfSubjects, true) && compareDeep(correlatedLabs, o.correlatedLabs, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileMedicationComponent))
          return false;
        ClinicalProfileMedicationComponent o = (ClinicalProfileMedicationComponent) other_;
        return compareValues(treatementDuration, o.treatementDuration, true) && compareValues(fractionOfSubjects, o.fractionOfSubjects, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(medication, dosage, treatementDuration
          , fractionOfSubjects, correlatedLabs);
      }

  public String fhirType() {
    return "ClinicalProfile.medication";

  }

  }

    @Block()
    public static class ClinicalProfileMedicationDosageComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Free text dosage instructions e.g. SIG.
         */
        @Child(name = "text", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Free text dosage instructions e.g. SIG", formalDefinition="Free text dosage instructions e.g. SIG." )
        protected StringType text;

        /**
         * Body site(s) administered to.
         */
        @Child(name = "site", type = {CodeableConcept.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Body site(s) administered to", formalDefinition="Body site(s) administered to." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/approach-site-codes")
        protected List<CodeableConcept> site;

        /**
         * Path(s) of substance into body.
         */
        @Child(name = "route", type = {CodeableConcept.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Path(s) of substance into body", formalDefinition="Path(s) of substance into body." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/route-codes")
        protected List<CodeableConcept> route;

        /**
         * How the drug was administered.
         */
        @Child(name = "method", type = {CodeableConcept.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="How the drug was administered", formalDefinition="How the drug was administered." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/administration-method-codes")
        protected List<CodeableConcept> method;

        /**
         * Average amount of medication per dose.
         */
        @Child(name = "dose", type = {Quantity.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Average amount of medication per dose", formalDefinition="Average amount of medication per dose." )
        protected List<Quantity> dose;

        /**
         * Dose quantity per unit of time.
         */
        @Child(name = "rate", type = {Ratio.class, Quantity.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Dose quantity per unit of time", formalDefinition="Dose quantity per unit of time." )
        protected Type rate;

        private static final long serialVersionUID = -1154319602L;

    /**
     * Constructor
     */
      public ClinicalProfileMedicationDosageComponent() {
        super();
      }

        /**
         * @return {@link #text} (Free text dosage instructions e.g. SIG.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
         */
        public StringType getTextElement() { 
          if (this.text == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationDosageComponent.text");
            else if (Configuration.doAutoCreate())
              this.text = new StringType(); // bb
          return this.text;
        }

        public boolean hasTextElement() { 
          return this.text != null && !this.text.isEmpty();
        }

        public boolean hasText() { 
          return this.text != null && !this.text.isEmpty();
        }

        /**
         * @param value {@link #text} (Free text dosage instructions e.g. SIG.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
         */
        public ClinicalProfileMedicationDosageComponent setTextElement(StringType value) { 
          this.text = value;
          return this;
        }

        /**
         * @return Free text dosage instructions e.g. SIG.
         */
        public String getText() { 
          return this.text == null ? null : this.text.getValue();
        }

        /**
         * @param value Free text dosage instructions e.g. SIG.
         */
        public ClinicalProfileMedicationDosageComponent setText(String value) { 
          if (Utilities.noString(value))
            this.text = null;
          else {
            if (this.text == null)
              this.text = new StringType();
            this.text.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #site} (Body site(s) administered to.)
         */
        public List<CodeableConcept> getSite() { 
          if (this.site == null)
            this.site = new ArrayList<CodeableConcept>();
          return this.site;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileMedicationDosageComponent setSite(List<CodeableConcept> theSite) { 
          this.site = theSite;
          return this;
        }

        public boolean hasSite() { 
          if (this.site == null)
            return false;
          for (CodeableConcept item : this.site)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addSite() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.site == null)
            this.site = new ArrayList<CodeableConcept>();
          this.site.add(t);
          return t;
        }

        public ClinicalProfileMedicationDosageComponent addSite(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.site == null)
            this.site = new ArrayList<CodeableConcept>();
          this.site.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #site}, creating it if it does not already exist
         */
        public CodeableConcept getSiteFirstRep() { 
          if (getSite().isEmpty()) {
            addSite();
          }
          return getSite().get(0);
        }

        /**
         * @return {@link #route} (Path(s) of substance into body.)
         */
        public List<CodeableConcept> getRoute() { 
          if (this.route == null)
            this.route = new ArrayList<CodeableConcept>();
          return this.route;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileMedicationDosageComponent setRoute(List<CodeableConcept> theRoute) { 
          this.route = theRoute;
          return this;
        }

        public boolean hasRoute() { 
          if (this.route == null)
            return false;
          for (CodeableConcept item : this.route)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addRoute() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.route == null)
            this.route = new ArrayList<CodeableConcept>();
          this.route.add(t);
          return t;
        }

        public ClinicalProfileMedicationDosageComponent addRoute(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.route == null)
            this.route = new ArrayList<CodeableConcept>();
          this.route.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #route}, creating it if it does not already exist
         */
        public CodeableConcept getRouteFirstRep() { 
          if (getRoute().isEmpty()) {
            addRoute();
          }
          return getRoute().get(0);
        }

        /**
         * @return {@link #method} (How the drug was administered.)
         */
        public List<CodeableConcept> getMethod() { 
          if (this.method == null)
            this.method = new ArrayList<CodeableConcept>();
          return this.method;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileMedicationDosageComponent setMethod(List<CodeableConcept> theMethod) { 
          this.method = theMethod;
          return this;
        }

        public boolean hasMethod() { 
          if (this.method == null)
            return false;
          for (CodeableConcept item : this.method)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addMethod() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.method == null)
            this.method = new ArrayList<CodeableConcept>();
          this.method.add(t);
          return t;
        }

        public ClinicalProfileMedicationDosageComponent addMethod(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.method == null)
            this.method = new ArrayList<CodeableConcept>();
          this.method.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #method}, creating it if it does not already exist
         */
        public CodeableConcept getMethodFirstRep() { 
          if (getMethod().isEmpty()) {
            addMethod();
          }
          return getMethod().get(0);
        }

        /**
         * @return {@link #dose} (Average amount of medication per dose.)
         */
        public List<Quantity> getDose() { 
          if (this.dose == null)
            this.dose = new ArrayList<Quantity>();
          return this.dose;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileMedicationDosageComponent setDose(List<Quantity> theDose) { 
          this.dose = theDose;
          return this;
        }

        public boolean hasDose() { 
          if (this.dose == null)
            return false;
          for (Quantity item : this.dose)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Quantity addDose() { //3
          Quantity t = new Quantity();
          if (this.dose == null)
            this.dose = new ArrayList<Quantity>();
          this.dose.add(t);
          return t;
        }

        public ClinicalProfileMedicationDosageComponent addDose(Quantity t) { //3
          if (t == null)
            return this;
          if (this.dose == null)
            this.dose = new ArrayList<Quantity>();
          this.dose.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #dose}, creating it if it does not already exist
         */
        public Quantity getDoseFirstRep() { 
          if (getDose().isEmpty()) {
            addDose();
          }
          return getDose().get(0);
        }

        /**
         * @return {@link #rate} (Dose quantity per unit of time.)
         */
        public Type getRate() { 
          return this.rate;
        }

        /**
         * @return {@link #rate} (Dose quantity per unit of time.)
         */
        public Ratio getRateRatio() throws FHIRException { 
          if (this.rate == null)
            this.rate = new Ratio();
          if (!(this.rate instanceof Ratio))
            throw new FHIRException("Type mismatch: the type Ratio was expected, but "+this.rate.getClass().getName()+" was encountered");
          return (Ratio) this.rate;
        }

        public boolean hasRateRatio() { 
          return this != null && this.rate instanceof Ratio;
        }

        /**
         * @return {@link #rate} (Dose quantity per unit of time.)
         */
        public Quantity getRateQuantity() throws FHIRException { 
          if (this.rate == null)
            this.rate = new Quantity();
          if (!(this.rate instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but "+this.rate.getClass().getName()+" was encountered");
          return (Quantity) this.rate;
        }

        public boolean hasRateQuantity() { 
          return this != null && this.rate instanceof Quantity;
        }

        public boolean hasRate() { 
          return this.rate != null && !this.rate.isEmpty();
        }

        /**
         * @param value {@link #rate} (Dose quantity per unit of time.)
         */
        public ClinicalProfileMedicationDosageComponent setRate(Type value) { 
          if (value != null && !(value instanceof Ratio || value instanceof Quantity))
            throw new Error("Not the right type for ClinicalProfile.medication.dosage.rate[x]: "+value.fhirType());
          this.rate = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("text", "string", "Free text dosage instructions e.g. SIG.", 0, 1, text));
          children.add(new Property("site", "CodeableConcept", "Body site(s) administered to.", 0, java.lang.Integer.MAX_VALUE, site));
          children.add(new Property("route", "CodeableConcept", "Path(s) of substance into body.", 0, java.lang.Integer.MAX_VALUE, route));
          children.add(new Property("method", "CodeableConcept", "How the drug was administered.", 0, java.lang.Integer.MAX_VALUE, method));
          children.add(new Property("dose", "SimpleQuantity", "Average amount of medication per dose.", 0, java.lang.Integer.MAX_VALUE, dose));
          children.add(new Property("rate[x]", "Ratio|SimpleQuantity", "Dose quantity per unit of time.", 0, 1, rate));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3556653: /*text*/  return new Property("text", "string", "Free text dosage instructions e.g. SIG.", 0, 1, text);
          case 3530567: /*site*/  return new Property("site", "CodeableConcept", "Body site(s) administered to.", 0, java.lang.Integer.MAX_VALUE, site);
          case 108704329: /*route*/  return new Property("route", "CodeableConcept", "Path(s) of substance into body.", 0, java.lang.Integer.MAX_VALUE, route);
          case -1077554975: /*method*/  return new Property("method", "CodeableConcept", "How the drug was administered.", 0, java.lang.Integer.MAX_VALUE, method);
          case 3089437: /*dose*/  return new Property("dose", "SimpleQuantity", "Average amount of medication per dose.", 0, java.lang.Integer.MAX_VALUE, dose);
          case 983460768: /*rate[x]*/  return new Property("rate[x]", "Ratio|SimpleQuantity", "Dose quantity per unit of time.", 0, 1, rate);
          case 3493088: /*rate*/  return new Property("rate[x]", "Ratio|SimpleQuantity", "Dose quantity per unit of time.", 0, 1, rate);
          case 204021515: /*rateRatio*/  return new Property("rate[x]", "Ratio|SimpleQuantity", "Dose quantity per unit of time.", 0, 1, rate);
          case -1085459061: /*rateQuantity*/  return new Property("rate[x]", "Ratio|SimpleQuantity", "Dose quantity per unit of time.", 0, 1, rate);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3556653: /*text*/ return this.text == null ? new Base[0] : new Base[] {this.text}; // StringType
        case 3530567: /*site*/ return this.site == null ? new Base[0] : this.site.toArray(new Base[this.site.size()]); // CodeableConcept
        case 108704329: /*route*/ return this.route == null ? new Base[0] : this.route.toArray(new Base[this.route.size()]); // CodeableConcept
        case -1077554975: /*method*/ return this.method == null ? new Base[0] : this.method.toArray(new Base[this.method.size()]); // CodeableConcept
        case 3089437: /*dose*/ return this.dose == null ? new Base[0] : this.dose.toArray(new Base[this.dose.size()]); // Quantity
        case 3493088: /*rate*/ return this.rate == null ? new Base[0] : new Base[] {this.rate}; // Type
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3556653: // text
          this.text = castToString(value); // StringType
          return value;
        case 3530567: // site
          this.getSite().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 108704329: // route
          this.getRoute().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -1077554975: // method
          this.getMethod().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 3089437: // dose
          this.getDose().add(castToQuantity(value)); // Quantity
          return value;
        case 3493088: // rate
          this.rate = castToType(value); // Type
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("text")) {
          this.text = castToString(value); // StringType
        } else if (name.equals("site")) {
          this.getSite().add(castToCodeableConcept(value));
        } else if (name.equals("route")) {
          this.getRoute().add(castToCodeableConcept(value));
        } else if (name.equals("method")) {
          this.getMethod().add(castToCodeableConcept(value));
        } else if (name.equals("dose")) {
          this.getDose().add(castToQuantity(value));
        } else if (name.equals("rate[x]")) {
          this.rate = castToType(value); // Type
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3556653:  return getTextElement();
        case 3530567:  return addSite(); 
        case 108704329:  return addRoute(); 
        case -1077554975:  return addMethod(); 
        case 3089437:  return addDose(); 
        case 983460768:  return getRate(); 
        case 3493088:  return getRate(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3556653: /*text*/ return new String[] {"string"};
        case 3530567: /*site*/ return new String[] {"CodeableConcept"};
        case 108704329: /*route*/ return new String[] {"CodeableConcept"};
        case -1077554975: /*method*/ return new String[] {"CodeableConcept"};
        case 3089437: /*dose*/ return new String[] {"SimpleQuantity"};
        case 3493088: /*rate*/ return new String[] {"Ratio", "SimpleQuantity"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("text")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.text");
        }
        else if (name.equals("site")) {
          return addSite();
        }
        else if (name.equals("route")) {
          return addRoute();
        }
        else if (name.equals("method")) {
          return addMethod();
        }
        else if (name.equals("dose")) {
          return addDose();
        }
        else if (name.equals("rateRatio")) {
          this.rate = new Ratio();
          return this.rate;
        }
        else if (name.equals("rateQuantity")) {
          this.rate = new Quantity();
          return this.rate;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileMedicationDosageComponent copy() {
        ClinicalProfileMedicationDosageComponent dst = new ClinicalProfileMedicationDosageComponent();
        copyValues(dst);
        dst.text = text == null ? null : text.copy();
        if (site != null) {
          dst.site = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : site)
            dst.site.add(i.copy());
        };
        if (route != null) {
          dst.route = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : route)
            dst.route.add(i.copy());
        };
        if (method != null) {
          dst.method = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : method)
            dst.method.add(i.copy());
        };
        if (dose != null) {
          dst.dose = new ArrayList<Quantity>();
          for (Quantity i : dose)
            dst.dose.add(i.copy());
        };
        dst.rate = rate == null ? null : rate.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileMedicationDosageComponent))
          return false;
        ClinicalProfileMedicationDosageComponent o = (ClinicalProfileMedicationDosageComponent) other_;
        return compareDeep(text, o.text, true) && compareDeep(site, o.site, true) && compareDeep(route, o.route, true)
           && compareDeep(method, o.method, true) && compareDeep(dose, o.dose, true) && compareDeep(rate, o.rate, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileMedicationDosageComponent))
          return false;
        ClinicalProfileMedicationDosageComponent o = (ClinicalProfileMedicationDosageComponent) other_;
        return compareValues(text, o.text, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(text, site, route, method
          , dose, rate);
      }

  public String fhirType() {
    return "ClinicalProfile.medication.dosage";

  }

  }

    @Block()
    public static class ClinicalProfileMedicationCorrelatedLabsComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Number of labs cutoff (e.g. top 10).
         */
        @Child(name = "topn", type = {IntegerType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Number of labs cutoff (e.g. top 10)", formalDefinition="Number of labs cutoff (e.g. top 10)." )
        protected IntegerType topn;

        /**
         * Deviation cutoff.
         */
        @Child(name = "deviation", type = {DecimalType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Deviation cutoff", formalDefinition="Deviation cutoff." )
        protected DecimalType deviation;

        /**
         * Lab with significant deviation relative value.
         */
        @Child(name = "entry", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Lab with significant deviation relative value", formalDefinition="Lab with significant deviation relative value." )
        protected List<ClinicalProfileMedicationCorrelatedLabsEntryComponent> entry;

        private static final long serialVersionUID = -1134169766L;

    /**
     * Constructor
     */
      public ClinicalProfileMedicationCorrelatedLabsComponent() {
        super();
      }

        /**
         * @return {@link #topn} (Number of labs cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public IntegerType getTopnElement() { 
          if (this.topn == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationCorrelatedLabsComponent.topn");
            else if (Configuration.doAutoCreate())
              this.topn = new IntegerType(); // bb
          return this.topn;
        }

        public boolean hasTopnElement() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        public boolean hasTopn() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        /**
         * @param value {@link #topn} (Number of labs cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public ClinicalProfileMedicationCorrelatedLabsComponent setTopnElement(IntegerType value) { 
          this.topn = value;
          return this;
        }

        /**
         * @return Number of labs cutoff (e.g. top 10).
         */
        public int getTopn() { 
          return this.topn == null || this.topn.isEmpty() ? 0 : this.topn.getValue();
        }

        /**
         * @param value Number of labs cutoff (e.g. top 10).
         */
        public ClinicalProfileMedicationCorrelatedLabsComponent setTopn(int value) { 
            if (this.topn == null)
              this.topn = new IntegerType();
            this.topn.setValue(value);
          return this;
        }

        /**
         * @return {@link #deviation} (Deviation cutoff.). This is the underlying object with id, value and extensions. The accessor "getDeviation" gives direct access to the value
         */
        public DecimalType getDeviationElement() { 
          if (this.deviation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationCorrelatedLabsComponent.deviation");
            else if (Configuration.doAutoCreate())
              this.deviation = new DecimalType(); // bb
          return this.deviation;
        }

        public boolean hasDeviationElement() { 
          return this.deviation != null && !this.deviation.isEmpty();
        }

        public boolean hasDeviation() { 
          return this.deviation != null && !this.deviation.isEmpty();
        }

        /**
         * @param value {@link #deviation} (Deviation cutoff.). This is the underlying object with id, value and extensions. The accessor "getDeviation" gives direct access to the value
         */
        public ClinicalProfileMedicationCorrelatedLabsComponent setDeviationElement(DecimalType value) { 
          this.deviation = value;
          return this;
        }

        /**
         * @return Deviation cutoff.
         */
        public BigDecimal getDeviation() { 
          return this.deviation == null ? null : this.deviation.getValue();
        }

        /**
         * @param value Deviation cutoff.
         */
        public ClinicalProfileMedicationCorrelatedLabsComponent setDeviation(BigDecimal value) { 
          if (value == null)
            this.deviation = null;
          else {
            if (this.deviation == null)
              this.deviation = new DecimalType();
            this.deviation.setValue(value);
          }
          return this;
        }

        /**
         * @param value Deviation cutoff.
         */
        public ClinicalProfileMedicationCorrelatedLabsComponent setDeviation(long value) { 
              this.deviation = new DecimalType();
            this.deviation.setValue(value);
          return this;
        }

        /**
         * @param value Deviation cutoff.
         */
        public ClinicalProfileMedicationCorrelatedLabsComponent setDeviation(double value) { 
              this.deviation = new DecimalType();
            this.deviation.setValue(value);
          return this;
        }

        /**
         * @return {@link #entry} (Lab with significant deviation relative value.)
         */
        public List<ClinicalProfileMedicationCorrelatedLabsEntryComponent> getEntry() { 
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileMedicationCorrelatedLabsEntryComponent>();
          return this.entry;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileMedicationCorrelatedLabsComponent setEntry(List<ClinicalProfileMedicationCorrelatedLabsEntryComponent> theEntry) { 
          this.entry = theEntry;
          return this;
        }

        public boolean hasEntry() { 
          if (this.entry == null)
            return false;
          for (ClinicalProfileMedicationCorrelatedLabsEntryComponent item : this.entry)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public ClinicalProfileMedicationCorrelatedLabsEntryComponent addEntry() { //3
          ClinicalProfileMedicationCorrelatedLabsEntryComponent t = new ClinicalProfileMedicationCorrelatedLabsEntryComponent();
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileMedicationCorrelatedLabsEntryComponent>();
          this.entry.add(t);
          return t;
        }

        public ClinicalProfileMedicationCorrelatedLabsComponent addEntry(ClinicalProfileMedicationCorrelatedLabsEntryComponent t) { //3
          if (t == null)
            return this;
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileMedicationCorrelatedLabsEntryComponent>();
          this.entry.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #entry}, creating it if it does not already exist
         */
        public ClinicalProfileMedicationCorrelatedLabsEntryComponent getEntryFirstRep() { 
          if (getEntry().isEmpty()) {
            addEntry();
          }
          return getEntry().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("topn", "integer", "Number of labs cutoff (e.g. top 10).", 0, 1, topn));
          children.add(new Property("deviation", "decimal", "Deviation cutoff.", 0, 1, deviation));
          children.add(new Property("entry", "", "Lab with significant deviation relative value.", 0, java.lang.Integer.MAX_VALUE, entry));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3566009: /*topn*/  return new Property("topn", "integer", "Number of labs cutoff (e.g. top 10).", 0, 1, topn);
          case 23819393: /*deviation*/  return new Property("deviation", "decimal", "Deviation cutoff.", 0, 1, deviation);
          case 96667762: /*entry*/  return new Property("entry", "", "Lab with significant deviation relative value.", 0, java.lang.Integer.MAX_VALUE, entry);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return this.topn == null ? new Base[0] : new Base[] {this.topn}; // IntegerType
        case 23819393: /*deviation*/ return this.deviation == null ? new Base[0] : new Base[] {this.deviation}; // DecimalType
        case 96667762: /*entry*/ return this.entry == null ? new Base[0] : this.entry.toArray(new Base[this.entry.size()]); // ClinicalProfileMedicationCorrelatedLabsEntryComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3566009: // topn
          this.topn = castToInteger(value); // IntegerType
          return value;
        case 23819393: // deviation
          this.deviation = castToDecimal(value); // DecimalType
          return value;
        case 96667762: // entry
          this.getEntry().add((ClinicalProfileMedicationCorrelatedLabsEntryComponent) value); // ClinicalProfileMedicationCorrelatedLabsEntryComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("topn")) {
          this.topn = castToInteger(value); // IntegerType
        } else if (name.equals("deviation")) {
          this.deviation = castToDecimal(value); // DecimalType
        } else if (name.equals("entry")) {
          this.getEntry().add((ClinicalProfileMedicationCorrelatedLabsEntryComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009:  return getTopnElement();
        case 23819393:  return getDeviationElement();
        case 96667762:  return addEntry(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return new String[] {"integer"};
        case 23819393: /*deviation*/ return new String[] {"decimal"};
        case 96667762: /*entry*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("topn")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.topn");
        }
        else if (name.equals("deviation")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.deviation");
        }
        else if (name.equals("entry")) {
          return addEntry();
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileMedicationCorrelatedLabsComponent copy() {
        ClinicalProfileMedicationCorrelatedLabsComponent dst = new ClinicalProfileMedicationCorrelatedLabsComponent();
        copyValues(dst);
        dst.topn = topn == null ? null : topn.copy();
        dst.deviation = deviation == null ? null : deviation.copy();
        if (entry != null) {
          dst.entry = new ArrayList<ClinicalProfileMedicationCorrelatedLabsEntryComponent>();
          for (ClinicalProfileMedicationCorrelatedLabsEntryComponent i : entry)
            dst.entry.add(i.copy());
        };
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileMedicationCorrelatedLabsComponent))
          return false;
        ClinicalProfileMedicationCorrelatedLabsComponent o = (ClinicalProfileMedicationCorrelatedLabsComponent) other_;
        return compareDeep(topn, o.topn, true) && compareDeep(deviation, o.deviation, true) && compareDeep(entry, o.entry, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileMedicationCorrelatedLabsComponent))
          return false;
        ClinicalProfileMedicationCorrelatedLabsComponent o = (ClinicalProfileMedicationCorrelatedLabsComponent) other_;
        return compareValues(topn, o.topn, true) && compareValues(deviation, o.deviation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(topn, deviation, entry);
      }

  public String fhirType() {
    return "ClinicalProfile.medication.correlatedLabs";

  }

  }

    @Block()
    public static class ClinicalProfileMedicationCorrelatedLabsEntryComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Lab code (LOINC) or Lab Group Code.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Lab code (LOINC) or Lab Group Code", formalDefinition="Lab code (LOINC) or Lab Group Code." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/observation-codes")
        protected List<CodeableConcept> code;

        /**
         * Fraction of subjects with this lab.
         */
        @Child(name = "fractionOfSubjects", type = {DecimalType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Fraction of subjects with this lab", formalDefinition="Fraction of subjects with this lab." )
        protected DecimalType fractionOfSubjects;

        /**
         * Value for this subset.
         */
        @Child(name = "deviationRelativeValue", type = {DecimalType.class}, order=3, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Value for this subset", formalDefinition="Value for this subset." )
        protected DecimalType deviationRelativeValue;

        private static final long serialVersionUID = -548351152L;

    /**
     * Constructor
     */
      public ClinicalProfileMedicationCorrelatedLabsEntryComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileMedicationCorrelatedLabsEntryComponent(DecimalType fractionOfSubjects, DecimalType deviationRelativeValue) {
        super();
        this.fractionOfSubjects = fractionOfSubjects;
        this.deviationRelativeValue = deviationRelativeValue;
      }

        /**
         * @return {@link #code} (Lab code (LOINC) or Lab Group Code.)
         */
        public List<CodeableConcept> getCode() { 
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          return this.code;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileMedicationCorrelatedLabsEntryComponent setCode(List<CodeableConcept> theCode) { 
          this.code = theCode;
          return this;
        }

        public boolean hasCode() { 
          if (this.code == null)
            return false;
          for (CodeableConcept item : this.code)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addCode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return t;
        }

        public ClinicalProfileMedicationCorrelatedLabsEntryComponent addCode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #code}, creating it if it does not already exist
         */
        public CodeableConcept getCodeFirstRep() { 
          if (getCode().isEmpty()) {
            addCode();
          }
          return getCode().get(0);
        }

        /**
         * @return {@link #fractionOfSubjects} (Fraction of subjects with this lab.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public DecimalType getFractionOfSubjectsElement() { 
          if (this.fractionOfSubjects == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationCorrelatedLabsEntryComponent.fractionOfSubjects");
            else if (Configuration.doAutoCreate())
              this.fractionOfSubjects = new DecimalType(); // bb
          return this.fractionOfSubjects;
        }

        public boolean hasFractionOfSubjectsElement() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        public boolean hasFractionOfSubjects() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        /**
         * @param value {@link #fractionOfSubjects} (Fraction of subjects with this lab.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public ClinicalProfileMedicationCorrelatedLabsEntryComponent setFractionOfSubjectsElement(DecimalType value) { 
          this.fractionOfSubjects = value;
          return this;
        }

        /**
         * @return Fraction of subjects with this lab.
         */
        public BigDecimal getFractionOfSubjects() { 
          return this.fractionOfSubjects == null ? null : this.fractionOfSubjects.getValue();
        }

        /**
         * @param value Fraction of subjects with this lab.
         */
        public ClinicalProfileMedicationCorrelatedLabsEntryComponent setFractionOfSubjects(BigDecimal value) { 
            if (this.fractionOfSubjects == null)
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of subjects with this lab.
         */
        public ClinicalProfileMedicationCorrelatedLabsEntryComponent setFractionOfSubjects(long value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of subjects with this lab.
         */
        public ClinicalProfileMedicationCorrelatedLabsEntryComponent setFractionOfSubjects(double value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @return {@link #deviationRelativeValue} (Value for this subset.). This is the underlying object with id, value and extensions. The accessor "getDeviationRelativeValue" gives direct access to the value
         */
        public DecimalType getDeviationRelativeValueElement() { 
          if (this.deviationRelativeValue == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationCorrelatedLabsEntryComponent.deviationRelativeValue");
            else if (Configuration.doAutoCreate())
              this.deviationRelativeValue = new DecimalType(); // bb
          return this.deviationRelativeValue;
        }

        public boolean hasDeviationRelativeValueElement() { 
          return this.deviationRelativeValue != null && !this.deviationRelativeValue.isEmpty();
        }

        public boolean hasDeviationRelativeValue() { 
          return this.deviationRelativeValue != null && !this.deviationRelativeValue.isEmpty();
        }

        /**
         * @param value {@link #deviationRelativeValue} (Value for this subset.). This is the underlying object with id, value and extensions. The accessor "getDeviationRelativeValue" gives direct access to the value
         */
        public ClinicalProfileMedicationCorrelatedLabsEntryComponent setDeviationRelativeValueElement(DecimalType value) { 
          this.deviationRelativeValue = value;
          return this;
        }

        /**
         * @return Value for this subset.
         */
        public BigDecimal getDeviationRelativeValue() { 
          return this.deviationRelativeValue == null ? null : this.deviationRelativeValue.getValue();
        }

        /**
         * @param value Value for this subset.
         */
        public ClinicalProfileMedicationCorrelatedLabsEntryComponent setDeviationRelativeValue(BigDecimal value) { 
            if (this.deviationRelativeValue == null)
              this.deviationRelativeValue = new DecimalType();
            this.deviationRelativeValue.setValue(value);
          return this;
        }

        /**
         * @param value Value for this subset.
         */
        public ClinicalProfileMedicationCorrelatedLabsEntryComponent setDeviationRelativeValue(long value) { 
              this.deviationRelativeValue = new DecimalType();
            this.deviationRelativeValue.setValue(value);
          return this;
        }

        /**
         * @param value Value for this subset.
         */
        public ClinicalProfileMedicationCorrelatedLabsEntryComponent setDeviationRelativeValue(double value) { 
              this.deviationRelativeValue = new DecimalType();
            this.deviationRelativeValue.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "Lab code (LOINC) or Lab Group Code.", 0, java.lang.Integer.MAX_VALUE, code));
          children.add(new Property("fractionOfSubjects", "decimal", "Fraction of subjects with this lab.", 0, 1, fractionOfSubjects));
          children.add(new Property("deviationRelativeValue", "decimal", "Value for this subset.", 0, 1, deviationRelativeValue));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "Lab code (LOINC) or Lab Group Code.", 0, java.lang.Integer.MAX_VALUE, code);
          case -254443680: /*fractionOfSubjects*/  return new Property("fractionOfSubjects", "decimal", "Fraction of subjects with this lab.", 0, 1, fractionOfSubjects);
          case -508470524: /*deviationRelativeValue*/  return new Property("deviationRelativeValue", "decimal", "Value for this subset.", 0, 1, deviationRelativeValue);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : this.code.toArray(new Base[this.code.size()]); // CodeableConcept
        case -254443680: /*fractionOfSubjects*/ return this.fractionOfSubjects == null ? new Base[0] : new Base[] {this.fractionOfSubjects}; // DecimalType
        case -508470524: /*deviationRelativeValue*/ return this.deviationRelativeValue == null ? new Base[0] : new Base[] {this.deviationRelativeValue}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.getCode().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -254443680: // fractionOfSubjects
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
          return value;
        case -508470524: // deviationRelativeValue
          this.deviationRelativeValue = castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.getCode().add(castToCodeableConcept(value));
        } else if (name.equals("fractionOfSubjects")) {
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
        } else if (name.equals("deviationRelativeValue")) {
          this.deviationRelativeValue = castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return addCode(); 
        case -254443680:  return getFractionOfSubjectsElement();
        case -508470524:  return getDeviationRelativeValueElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case -254443680: /*fractionOfSubjects*/ return new String[] {"decimal"};
        case -508470524: /*deviationRelativeValue*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          return addCode();
        }
        else if (name.equals("fractionOfSubjects")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionOfSubjects");
        }
        else if (name.equals("deviationRelativeValue")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.deviationRelativeValue");
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileMedicationCorrelatedLabsEntryComponent copy() {
        ClinicalProfileMedicationCorrelatedLabsEntryComponent dst = new ClinicalProfileMedicationCorrelatedLabsEntryComponent();
        copyValues(dst);
        if (code != null) {
          dst.code = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : code)
            dst.code.add(i.copy());
        };
        dst.fractionOfSubjects = fractionOfSubjects == null ? null : fractionOfSubjects.copy();
        dst.deviationRelativeValue = deviationRelativeValue == null ? null : deviationRelativeValue.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileMedicationCorrelatedLabsEntryComponent))
          return false;
        ClinicalProfileMedicationCorrelatedLabsEntryComponent o = (ClinicalProfileMedicationCorrelatedLabsEntryComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(fractionOfSubjects, o.fractionOfSubjects, true)
           && compareDeep(deviationRelativeValue, o.deviationRelativeValue, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileMedicationCorrelatedLabsEntryComponent))
          return false;
        ClinicalProfileMedicationCorrelatedLabsEntryComponent o = (ClinicalProfileMedicationCorrelatedLabsEntryComponent) other_;
        return compareValues(fractionOfSubjects, o.fractionOfSubjects, true) && compareValues(deviationRelativeValue, o.deviationRelativeValue, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, fractionOfSubjects, deviationRelativeValue
          );
      }

  public String fhirType() {
    return "ClinicalProfile.medication.correlatedLabs.entry";

  }

  }

    @Block()
    public static class ClinicalProfileDiagnosisComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Diagnosis code(s).
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Diagnosis code(s)", formalDefinition="Diagnosis code(s)." )
        protected List<CodeableConcept> code;

        /**
         * Number of times listed per patient per hear for each code.
         */
        @Child(name = "count", type = {IntegerType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Number of times listed per patient per hear for each code", formalDefinition="Number of times listed per patient per hear for each code." )
        protected IntegerType count;

        private static final long serialVersionUID = -199945833L;

    /**
     * Constructor
     */
      public ClinicalProfileDiagnosisComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileDiagnosisComponent(IntegerType count) {
        super();
        this.count = count;
      }

        /**
         * @return {@link #code} (Diagnosis code(s).)
         */
        public List<CodeableConcept> getCode() { 
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          return this.code;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileDiagnosisComponent setCode(List<CodeableConcept> theCode) { 
          this.code = theCode;
          return this;
        }

        public boolean hasCode() { 
          if (this.code == null)
            return false;
          for (CodeableConcept item : this.code)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addCode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return t;
        }

        public ClinicalProfileDiagnosisComponent addCode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #code}, creating it if it does not already exist
         */
        public CodeableConcept getCodeFirstRep() { 
          if (getCode().isEmpty()) {
            addCode();
          }
          return getCode().get(0);
        }

        /**
         * @return {@link #count} (Number of times listed per patient per hear for each code.). This is the underlying object with id, value and extensions. The accessor "getCount" gives direct access to the value
         */
        public IntegerType getCountElement() { 
          if (this.count == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileDiagnosisComponent.count");
            else if (Configuration.doAutoCreate())
              this.count = new IntegerType(); // bb
          return this.count;
        }

        public boolean hasCountElement() { 
          return this.count != null && !this.count.isEmpty();
        }

        public boolean hasCount() { 
          return this.count != null && !this.count.isEmpty();
        }

        /**
         * @param value {@link #count} (Number of times listed per patient per hear for each code.). This is the underlying object with id, value and extensions. The accessor "getCount" gives direct access to the value
         */
        public ClinicalProfileDiagnosisComponent setCountElement(IntegerType value) { 
          this.count = value;
          return this;
        }

        /**
         * @return Number of times listed per patient per hear for each code.
         */
        public int getCount() { 
          return this.count == null || this.count.isEmpty() ? 0 : this.count.getValue();
        }

        /**
         * @param value Number of times listed per patient per hear for each code.
         */
        public ClinicalProfileDiagnosisComponent setCount(int value) { 
            if (this.count == null)
              this.count = new IntegerType();
            this.count.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "Diagnosis code(s).", 0, java.lang.Integer.MAX_VALUE, code));
          children.add(new Property("count", "integer", "Number of times listed per patient per hear for each code.", 0, 1, count));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "Diagnosis code(s).", 0, java.lang.Integer.MAX_VALUE, code);
          case 94851343: /*count*/  return new Property("count", "integer", "Number of times listed per patient per hear for each code.", 0, 1, count);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : this.code.toArray(new Base[this.code.size()]); // CodeableConcept
        case 94851343: /*count*/ return this.count == null ? new Base[0] : new Base[] {this.count}; // IntegerType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.getCode().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 94851343: // count
          this.count = castToInteger(value); // IntegerType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.getCode().add(castToCodeableConcept(value));
        } else if (name.equals("count")) {
          this.count = castToInteger(value); // IntegerType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return addCode(); 
        case 94851343:  return getCountElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case 94851343: /*count*/ return new String[] {"integer"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          return addCode();
        }
        else if (name.equals("count")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.count");
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileDiagnosisComponent copy() {
        ClinicalProfileDiagnosisComponent dst = new ClinicalProfileDiagnosisComponent();
        copyValues(dst);
        if (code != null) {
          dst.code = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : code)
            dst.code.add(i.copy());
        };
        dst.count = count == null ? null : count.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileDiagnosisComponent))
          return false;
        ClinicalProfileDiagnosisComponent o = (ClinicalProfileDiagnosisComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(count, o.count, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileDiagnosisComponent))
          return false;
        ClinicalProfileDiagnosisComponent o = (ClinicalProfileDiagnosisComponent) other_;
        return compareValues(count, o.count, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, count);
      }

  public String fhirType() {
    return "ClinicalProfile.diagnosis";

  }

  }

    @Block()
    public static class ClinicalProfileProcedureComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * ICD-10-PCS or CPT procedure code.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="ICD-10-PCS or CPT procedure code", formalDefinition="ICD-10-PCS or CPT procedure code." )
        protected List<CodeableConcept> code;

        /**
         * Fraction of patients with this procedure per year.
         */
        @Child(name = "fractionOfSubjects", type = {DecimalType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Fraction of patients with this procedure per year", formalDefinition="Fraction of patients with this procedure per year." )
        protected DecimalType fractionOfSubjects;

        /**
         * The to N most closely correlated ICD10 codes.
         */
        @Child(name = "correlatedDiagnoses", type = {}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The to N most closely correlated ICD10 codes", formalDefinition="The to N most closely correlated ICD10 codes." )
        protected ClinicalProfileProcedureCorrelatedDiagnosesComponent correlatedDiagnoses;

        private static final long serialVersionUID = 1685479119L;

    /**
     * Constructor
     */
      public ClinicalProfileProcedureComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileProcedureComponent(DecimalType fractionOfSubjects) {
        super();
        this.fractionOfSubjects = fractionOfSubjects;
      }

        /**
         * @return {@link #code} (ICD-10-PCS or CPT procedure code.)
         */
        public List<CodeableConcept> getCode() { 
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          return this.code;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileProcedureComponent setCode(List<CodeableConcept> theCode) { 
          this.code = theCode;
          return this;
        }

        public boolean hasCode() { 
          if (this.code == null)
            return false;
          for (CodeableConcept item : this.code)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addCode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return t;
        }

        public ClinicalProfileProcedureComponent addCode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #code}, creating it if it does not already exist
         */
        public CodeableConcept getCodeFirstRep() { 
          if (getCode().isEmpty()) {
            addCode();
          }
          return getCode().get(0);
        }

        /**
         * @return {@link #fractionOfSubjects} (Fraction of patients with this procedure per year.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public DecimalType getFractionOfSubjectsElement() { 
          if (this.fractionOfSubjects == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureComponent.fractionOfSubjects");
            else if (Configuration.doAutoCreate())
              this.fractionOfSubjects = new DecimalType(); // bb
          return this.fractionOfSubjects;
        }

        public boolean hasFractionOfSubjectsElement() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        public boolean hasFractionOfSubjects() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        /**
         * @param value {@link #fractionOfSubjects} (Fraction of patients with this procedure per year.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public ClinicalProfileProcedureComponent setFractionOfSubjectsElement(DecimalType value) { 
          this.fractionOfSubjects = value;
          return this;
        }

        /**
         * @return Fraction of patients with this procedure per year.
         */
        public BigDecimal getFractionOfSubjects() { 
          return this.fractionOfSubjects == null ? null : this.fractionOfSubjects.getValue();
        }

        /**
         * @param value Fraction of patients with this procedure per year.
         */
        public ClinicalProfileProcedureComponent setFractionOfSubjects(BigDecimal value) { 
            if (this.fractionOfSubjects == null)
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of patients with this procedure per year.
         */
        public ClinicalProfileProcedureComponent setFractionOfSubjects(long value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of patients with this procedure per year.
         */
        public ClinicalProfileProcedureComponent setFractionOfSubjects(double value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @return {@link #correlatedDiagnoses} (The to N most closely correlated ICD10 codes.)
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesComponent getCorrelatedDiagnoses() { 
          if (this.correlatedDiagnoses == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureComponent.correlatedDiagnoses");
            else if (Configuration.doAutoCreate())
              this.correlatedDiagnoses = new ClinicalProfileProcedureCorrelatedDiagnosesComponent(); // cc
          return this.correlatedDiagnoses;
        }

        public boolean hasCorrelatedDiagnoses() { 
          return this.correlatedDiagnoses != null && !this.correlatedDiagnoses.isEmpty();
        }

        /**
         * @param value {@link #correlatedDiagnoses} (The to N most closely correlated ICD10 codes.)
         */
        public ClinicalProfileProcedureComponent setCorrelatedDiagnoses(ClinicalProfileProcedureCorrelatedDiagnosesComponent value) { 
          this.correlatedDiagnoses = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "ICD-10-PCS or CPT procedure code.", 0, java.lang.Integer.MAX_VALUE, code));
          children.add(new Property("fractionOfSubjects", "decimal", "Fraction of patients with this procedure per year.", 0, 1, fractionOfSubjects));
          children.add(new Property("correlatedDiagnoses", "", "The to N most closely correlated ICD10 codes.", 0, 1, correlatedDiagnoses));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "ICD-10-PCS or CPT procedure code.", 0, java.lang.Integer.MAX_VALUE, code);
          case -254443680: /*fractionOfSubjects*/  return new Property("fractionOfSubjects", "decimal", "Fraction of patients with this procedure per year.", 0, 1, fractionOfSubjects);
          case -1514511344: /*correlatedDiagnoses*/  return new Property("correlatedDiagnoses", "", "The to N most closely correlated ICD10 codes.", 0, 1, correlatedDiagnoses);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : this.code.toArray(new Base[this.code.size()]); // CodeableConcept
        case -254443680: /*fractionOfSubjects*/ return this.fractionOfSubjects == null ? new Base[0] : new Base[] {this.fractionOfSubjects}; // DecimalType
        case -1514511344: /*correlatedDiagnoses*/ return this.correlatedDiagnoses == null ? new Base[0] : new Base[] {this.correlatedDiagnoses}; // ClinicalProfileProcedureCorrelatedDiagnosesComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.getCode().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -254443680: // fractionOfSubjects
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
          return value;
        case -1514511344: // correlatedDiagnoses
          this.correlatedDiagnoses = (ClinicalProfileProcedureCorrelatedDiagnosesComponent) value; // ClinicalProfileProcedureCorrelatedDiagnosesComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.getCode().add(castToCodeableConcept(value));
        } else if (name.equals("fractionOfSubjects")) {
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
        } else if (name.equals("correlatedDiagnoses")) {
          this.correlatedDiagnoses = (ClinicalProfileProcedureCorrelatedDiagnosesComponent) value; // ClinicalProfileProcedureCorrelatedDiagnosesComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return addCode(); 
        case -254443680:  return getFractionOfSubjectsElement();
        case -1514511344:  return getCorrelatedDiagnoses(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case -254443680: /*fractionOfSubjects*/ return new String[] {"decimal"};
        case -1514511344: /*correlatedDiagnoses*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          return addCode();
        }
        else if (name.equals("fractionOfSubjects")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionOfSubjects");
        }
        else if (name.equals("correlatedDiagnoses")) {
          this.correlatedDiagnoses = new ClinicalProfileProcedureCorrelatedDiagnosesComponent();
          return this.correlatedDiagnoses;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileProcedureComponent copy() {
        ClinicalProfileProcedureComponent dst = new ClinicalProfileProcedureComponent();
        copyValues(dst);
        if (code != null) {
          dst.code = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : code)
            dst.code.add(i.copy());
        };
        dst.fractionOfSubjects = fractionOfSubjects == null ? null : fractionOfSubjects.copy();
        dst.correlatedDiagnoses = correlatedDiagnoses == null ? null : correlatedDiagnoses.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileProcedureComponent))
          return false;
        ClinicalProfileProcedureComponent o = (ClinicalProfileProcedureComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(fractionOfSubjects, o.fractionOfSubjects, true)
           && compareDeep(correlatedDiagnoses, o.correlatedDiagnoses, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileProcedureComponent))
          return false;
        ClinicalProfileProcedureComponent o = (ClinicalProfileProcedureComponent) other_;
        return compareValues(fractionOfSubjects, o.fractionOfSubjects, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, fractionOfSubjects, correlatedDiagnoses
          );
      }

  public String fhirType() {
    return "ClinicalProfile.procedure";

  }

  }

    @Block()
    public static class ClinicalProfileProcedureCorrelatedDiagnosesComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Number of diagnoses cutoff (e.g. top 10).
         */
        @Child(name = "topn", type = {IntegerType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Number of diagnoses cutoff (e.g. top 10)", formalDefinition="Number of diagnoses cutoff (e.g. top 10)." )
        protected IntegerType topn;

        /**
         * Minimum absolute value of correlation coefficient.
         */
        @Child(name = "abscorrelation", type = {DecimalType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Minimum absolute value of correlation coefficient", formalDefinition="Minimum absolute value of correlation coefficient." )
        protected DecimalType abscorrelation;

        /**
         * Correlation entry.
         */
        @Child(name = "entry", type = {}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlation entry", formalDefinition="Correlation entry." )
        protected ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent entry;

        private static final long serialVersionUID = -1949445290L;

    /**
     * Constructor
     */
      public ClinicalProfileProcedureCorrelatedDiagnosesComponent() {
        super();
      }

        /**
         * @return {@link #topn} (Number of diagnoses cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public IntegerType getTopnElement() { 
          if (this.topn == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureCorrelatedDiagnosesComponent.topn");
            else if (Configuration.doAutoCreate())
              this.topn = new IntegerType(); // bb
          return this.topn;
        }

        public boolean hasTopnElement() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        public boolean hasTopn() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        /**
         * @param value {@link #topn} (Number of diagnoses cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesComponent setTopnElement(IntegerType value) { 
          this.topn = value;
          return this;
        }

        /**
         * @return Number of diagnoses cutoff (e.g. top 10).
         */
        public int getTopn() { 
          return this.topn == null || this.topn.isEmpty() ? 0 : this.topn.getValue();
        }

        /**
         * @param value Number of diagnoses cutoff (e.g. top 10).
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesComponent setTopn(int value) { 
            if (this.topn == null)
              this.topn = new IntegerType();
            this.topn.setValue(value);
          return this;
        }

        /**
         * @return {@link #abscorrelation} (Minimum absolute value of correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getAbscorrelation" gives direct access to the value
         */
        public DecimalType getAbscorrelationElement() { 
          if (this.abscorrelation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureCorrelatedDiagnosesComponent.abscorrelation");
            else if (Configuration.doAutoCreate())
              this.abscorrelation = new DecimalType(); // bb
          return this.abscorrelation;
        }

        public boolean hasAbscorrelationElement() { 
          return this.abscorrelation != null && !this.abscorrelation.isEmpty();
        }

        public boolean hasAbscorrelation() { 
          return this.abscorrelation != null && !this.abscorrelation.isEmpty();
        }

        /**
         * @param value {@link #abscorrelation} (Minimum absolute value of correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getAbscorrelation" gives direct access to the value
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesComponent setAbscorrelationElement(DecimalType value) { 
          this.abscorrelation = value;
          return this;
        }

        /**
         * @return Minimum absolute value of correlation coefficient.
         */
        public BigDecimal getAbscorrelation() { 
          return this.abscorrelation == null ? null : this.abscorrelation.getValue();
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesComponent setAbscorrelation(BigDecimal value) { 
          if (value == null)
            this.abscorrelation = null;
          else {
            if (this.abscorrelation == null)
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          }
          return this;
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesComponent setAbscorrelation(long value) { 
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          return this;
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesComponent setAbscorrelation(double value) { 
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          return this;
        }

        /**
         * @return {@link #entry} (Correlation entry.)
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent getEntry() { 
          if (this.entry == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureCorrelatedDiagnosesComponent.entry");
            else if (Configuration.doAutoCreate())
              this.entry = new ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent(); // cc
          return this.entry;
        }

        public boolean hasEntry() { 
          return this.entry != null && !this.entry.isEmpty();
        }

        /**
         * @param value {@link #entry} (Correlation entry.)
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesComponent setEntry(ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent value) { 
          this.entry = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("topn", "integer", "Number of diagnoses cutoff (e.g. top 10).", 0, 1, topn));
          children.add(new Property("abscorrelation", "decimal", "Minimum absolute value of correlation coefficient.", 0, 1, abscorrelation));
          children.add(new Property("entry", "", "Correlation entry.", 0, 1, entry));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3566009: /*topn*/  return new Property("topn", "integer", "Number of diagnoses cutoff (e.g. top 10).", 0, 1, topn);
          case -1112161840: /*abscorrelation*/  return new Property("abscorrelation", "decimal", "Minimum absolute value of correlation coefficient.", 0, 1, abscorrelation);
          case 96667762: /*entry*/  return new Property("entry", "", "Correlation entry.", 0, 1, entry);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return this.topn == null ? new Base[0] : new Base[] {this.topn}; // IntegerType
        case -1112161840: /*abscorrelation*/ return this.abscorrelation == null ? new Base[0] : new Base[] {this.abscorrelation}; // DecimalType
        case 96667762: /*entry*/ return this.entry == null ? new Base[0] : new Base[] {this.entry}; // ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3566009: // topn
          this.topn = castToInteger(value); // IntegerType
          return value;
        case -1112161840: // abscorrelation
          this.abscorrelation = castToDecimal(value); // DecimalType
          return value;
        case 96667762: // entry
          this.entry = (ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent) value; // ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("topn")) {
          this.topn = castToInteger(value); // IntegerType
        } else if (name.equals("abscorrelation")) {
          this.abscorrelation = castToDecimal(value); // DecimalType
        } else if (name.equals("entry")) {
          this.entry = (ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent) value; // ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009:  return getTopnElement();
        case -1112161840:  return getAbscorrelationElement();
        case 96667762:  return getEntry(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return new String[] {"integer"};
        case -1112161840: /*abscorrelation*/ return new String[] {"decimal"};
        case 96667762: /*entry*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("topn")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.topn");
        }
        else if (name.equals("abscorrelation")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.abscorrelation");
        }
        else if (name.equals("entry")) {
          this.entry = new ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent();
          return this.entry;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileProcedureCorrelatedDiagnosesComponent copy() {
        ClinicalProfileProcedureCorrelatedDiagnosesComponent dst = new ClinicalProfileProcedureCorrelatedDiagnosesComponent();
        copyValues(dst);
        dst.topn = topn == null ? null : topn.copy();
        dst.abscorrelation = abscorrelation == null ? null : abscorrelation.copy();
        dst.entry = entry == null ? null : entry.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileProcedureCorrelatedDiagnosesComponent))
          return false;
        ClinicalProfileProcedureCorrelatedDiagnosesComponent o = (ClinicalProfileProcedureCorrelatedDiagnosesComponent) other_;
        return compareDeep(topn, o.topn, true) && compareDeep(abscorrelation, o.abscorrelation, true) && compareDeep(entry, o.entry, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileProcedureCorrelatedDiagnosesComponent))
          return false;
        ClinicalProfileProcedureCorrelatedDiagnosesComponent o = (ClinicalProfileProcedureCorrelatedDiagnosesComponent) other_;
        return compareValues(topn, o.topn, true) && compareValues(abscorrelation, o.abscorrelation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(topn, abscorrelation, entry
          );
      }

  public String fhirType() {
    return "ClinicalProfile.procedure.correlatedDiagnoses";

  }

  }

    @Block()
    public static class ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Diagnosis code(s).
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Diagnosis code(s)", formalDefinition="Diagnosis code(s)." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/icd-10-procedures")
        protected CodeableConcept code;

        /**
         * Correlation coefficient.
         */
        @Child(name = "coefficient", type = {DecimalType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Correlation coefficient", formalDefinition="Correlation coefficient." )
        protected DecimalType coefficient;

        private static final long serialVersionUID = 1632628516L;

    /**
     * Constructor
     */
      public ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent(CodeableConcept code, DecimalType coefficient) {
        super();
        this.code = code;
        this.coefficient = coefficient;
      }

        /**
         * @return {@link #code} (Diagnosis code(s).)
         */
        public CodeableConcept getCode() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new CodeableConcept(); // cc
          return this.code;
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (Diagnosis code(s).)
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent setCode(CodeableConcept value) { 
          this.code = value;
          return this;
        }

        /**
         * @return {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public DecimalType getCoefficientElement() { 
          if (this.coefficient == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent.coefficient");
            else if (Configuration.doAutoCreate())
              this.coefficient = new DecimalType(); // bb
          return this.coefficient;
        }

        public boolean hasCoefficientElement() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        public boolean hasCoefficient() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        /**
         * @param value {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent setCoefficientElement(DecimalType value) { 
          this.coefficient = value;
          return this;
        }

        /**
         * @return Correlation coefficient.
         */
        public BigDecimal getCoefficient() { 
          return this.coefficient == null ? null : this.coefficient.getValue();
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent setCoefficient(BigDecimal value) { 
            if (this.coefficient == null)
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent setCoefficient(long value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent setCoefficient(double value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "Diagnosis code(s).", 0, 1, code));
          children.add(new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "Diagnosis code(s).", 0, 1, code);
          case 797813045: /*coefficient*/  return new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // CodeableConcept
        case 797813045: /*coefficient*/ return this.coefficient == null ? new Base[0] : new Base[] {this.coefficient}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.code = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 797813045: // coefficient
          this.coefficient = castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.code = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("coefficient")) {
          this.coefficient = castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return getCode(); 
        case 797813045:  return getCoefficientElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case 797813045: /*coefficient*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          this.code = new CodeableConcept();
          return this.code;
        }
        else if (name.equals("coefficient")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.coefficient");
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent copy() {
        ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent dst = new ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent();
        copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.coefficient = coefficient == null ? null : coefficient.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent))
          return false;
        ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent o = (ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(coefficient, o.coefficient, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent))
          return false;
        ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent o = (ClinicalProfileProcedureCorrelatedDiagnosesEntryComponent) other_;
        return compareValues(coefficient, o.coefficient, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, coefficient);
      }

  public String fhirType() {
    return "ClinicalProfile.procedure.correlatedDiagnoses.entry";

  }

  }

    /**
     * A formal identifier that is used to identify this ClinicalProfile when it is represented in other formats or referenced in a specification, model, design or an instance.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Additional identifier for the ClinicalProfile", formalDefinition="A formal identifier that is used to identify this ClinicalProfile when it is represented in other formats or referenced in a specification, model, design or an instance." )
    protected List<Identifier> identifier;

    /**
     * The ClinicalProfile status.
     */
    @Child(name = "status", type = {CodeType.class}, order=1, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="complete | draft | error", formalDefinition="The ClinicalProfile status." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/clinical-profile-status")
    protected Enumeration<ClinicalProfileStatus> status;

    /**
     * The base population against which this profile was generated.
     */
    @Child(name = "population", type = {Group.class}, order=2, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The base population against which this profile was generated", formalDefinition="The base population against which this profile was generated." )
    protected Reference population;

    /**
     * The actual object that is the target of the reference (The base population against which this profile was generated.)
     */
    protected Group populationTarget;

    /**
     * The cohort within the population that this profile represents.
     */
    @Child(name = "cohort", type = {Group.class}, order=3, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The cohort within the population that this profile represents", formalDefinition="The cohort within the population that this profile represents." )
    protected Reference cohort;

    /**
     * The actual object that is the target of the reference (The cohort within the population that this profile represents.)
     */
    protected Group cohortTarget;

    /**
     * When the profile was generated.
     */
    @Child(name = "date", type = {DateTimeType.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="When the profile was generated", formalDefinition="When the profile was generated." )
    protected DateTimeType date;

    /**
     * Identifier(s) from where the profile was acquired.
     */
    @Child(name = "source", type = {Identifier.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Identifier(s) from where the profile was acquired", formalDefinition="Identifier(s) from where the profile was acquired." )
    protected List<Identifier> source;

    /**
     * Who is reporting the data.
     */
    @Child(name = "reporter", type = {Organization.class, Practitioner.class, PractitionerRole.class, Location.class}, order=6, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Who is reporting the data", formalDefinition="Who is reporting the data." )
    protected Reference reporter;

    /**
     * The actual object that is the target of the reference (Who is reporting the data.)
     */
    protected Resource reporterTarget;

    /**
     * Laboratory profile entry.
     */
    @Child(name = "lab", type = {}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Laboratory profile entry", formalDefinition="Laboratory profile entry." )
    protected List<ClinicalProfileLabComponent> lab;

    /**
     * Medication profile entry.
     */
    @Child(name = "medication", type = {}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Medication profile entry", formalDefinition="Medication profile entry." )
    protected List<ClinicalProfileMedicationComponent> medication;

    /**
     * Diagnosis profile entry.
     */
    @Child(name = "diagnosis", type = {}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Diagnosis profile entry", formalDefinition="Diagnosis profile entry." )
    protected List<ClinicalProfileDiagnosisComponent> diagnosis;

    /**
     * Procedure profile entry.
     */
    @Child(name = "procedure", type = {}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Procedure profile entry", formalDefinition="Procedure profile entry." )
    protected List<ClinicalProfileProcedureComponent> procedure;

    private static final long serialVersionUID = 4408354L;

  /**
   * Constructor
   */
    public ClinicalProfile() {
      super();
    }

  /**
   * Constructor
   */
    public ClinicalProfile(Enumeration<ClinicalProfileStatus> status, Reference population, Reference cohort, Reference reporter) {
      super();
      this.status = status;
      this.population = population;
      this.cohort = cohort;
      this.reporter = reporter;
    }

    /**
     * @return {@link #identifier} (A formal identifier that is used to identify this ClinicalProfile when it is represented in other formats or referenced in a specification, model, design or an instance.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public ClinicalProfile addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #status} (The ClinicalProfile status.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ClinicalProfileStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<ClinicalProfileStatus>(new ClinicalProfileStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The ClinicalProfile status.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public ClinicalProfile setStatusElement(Enumeration<ClinicalProfileStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The ClinicalProfile status.
     */
    public ClinicalProfileStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The ClinicalProfile status.
     */
    public ClinicalProfile setStatus(ClinicalProfileStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<ClinicalProfileStatus>(new ClinicalProfileStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #population} (The base population against which this profile was generated.)
     */
    public Reference getPopulation() { 
      if (this.population == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.population");
        else if (Configuration.doAutoCreate())
          this.population = new Reference(); // cc
      return this.population;
    }

    public boolean hasPopulation() { 
      return this.population != null && !this.population.isEmpty();
    }

    /**
     * @param value {@link #population} (The base population against which this profile was generated.)
     */
    public ClinicalProfile setPopulation(Reference value) { 
      this.population = value;
      return this;
    }

    /**
     * @return {@link #population} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The base population against which this profile was generated.)
     */
    public Group getPopulationTarget() { 
      if (this.populationTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.population");
        else if (Configuration.doAutoCreate())
          this.populationTarget = new Group(); // aa
      return this.populationTarget;
    }

    /**
     * @param value {@link #population} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The base population against which this profile was generated.)
     */
    public ClinicalProfile setPopulationTarget(Group value) { 
      this.populationTarget = value;
      return this;
    }

    /**
     * @return {@link #cohort} (The cohort within the population that this profile represents.)
     */
    public Reference getCohort() { 
      if (this.cohort == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.cohort");
        else if (Configuration.doAutoCreate())
          this.cohort = new Reference(); // cc
      return this.cohort;
    }

    public boolean hasCohort() { 
      return this.cohort != null && !this.cohort.isEmpty();
    }

    /**
     * @param value {@link #cohort} (The cohort within the population that this profile represents.)
     */
    public ClinicalProfile setCohort(Reference value) { 
      this.cohort = value;
      return this;
    }

    /**
     * @return {@link #cohort} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The cohort within the population that this profile represents.)
     */
    public Group getCohortTarget() { 
      if (this.cohortTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.cohort");
        else if (Configuration.doAutoCreate())
          this.cohortTarget = new Group(); // aa
      return this.cohortTarget;
    }

    /**
     * @param value {@link #cohort} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The cohort within the population that this profile represents.)
     */
    public ClinicalProfile setCohortTarget(Group value) { 
      this.cohortTarget = value;
      return this;
    }

    /**
     * @return {@link #date} (When the profile was generated.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.date");
        else if (Configuration.doAutoCreate())
          this.date = new DateTimeType(); // bb
      return this.date;
    }

    public boolean hasDateElement() { 
      return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() { 
      return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (When the profile was generated.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ClinicalProfile setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return When the profile was generated.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value When the profile was generated.
     */
    public ClinicalProfile setDate(Date value) { 
      if (value == null)
        this.date = null;
      else {
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #source} (Identifier(s) from where the profile was acquired.)
     */
    public List<Identifier> getSource() { 
      if (this.source == null)
        this.source = new ArrayList<Identifier>();
      return this.source;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setSource(List<Identifier> theSource) { 
      this.source = theSource;
      return this;
    }

    public boolean hasSource() { 
      if (this.source == null)
        return false;
      for (Identifier item : this.source)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addSource() { //3
      Identifier t = new Identifier();
      if (this.source == null)
        this.source = new ArrayList<Identifier>();
      this.source.add(t);
      return t;
    }

    public ClinicalProfile addSource(Identifier t) { //3
      if (t == null)
        return this;
      if (this.source == null)
        this.source = new ArrayList<Identifier>();
      this.source.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #source}, creating it if it does not already exist
     */
    public Identifier getSourceFirstRep() { 
      if (getSource().isEmpty()) {
        addSource();
      }
      return getSource().get(0);
    }

    /**
     * @return {@link #reporter} (Who is reporting the data.)
     */
    public Reference getReporter() { 
      if (this.reporter == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.reporter");
        else if (Configuration.doAutoCreate())
          this.reporter = new Reference(); // cc
      return this.reporter;
    }

    public boolean hasReporter() { 
      return this.reporter != null && !this.reporter.isEmpty();
    }

    /**
     * @param value {@link #reporter} (Who is reporting the data.)
     */
    public ClinicalProfile setReporter(Reference value) { 
      this.reporter = value;
      return this;
    }

    /**
     * @return {@link #reporter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who is reporting the data.)
     */
    public Resource getReporterTarget() { 
      return this.reporterTarget;
    }

    /**
     * @param value {@link #reporter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who is reporting the data.)
     */
    public ClinicalProfile setReporterTarget(Resource value) { 
      this.reporterTarget = value;
      return this;
    }

    /**
     * @return {@link #lab} (Laboratory profile entry.)
     */
    public List<ClinicalProfileLabComponent> getLab() { 
      if (this.lab == null)
        this.lab = new ArrayList<ClinicalProfileLabComponent>();
      return this.lab;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setLab(List<ClinicalProfileLabComponent> theLab) { 
      this.lab = theLab;
      return this;
    }

    public boolean hasLab() { 
      if (this.lab == null)
        return false;
      for (ClinicalProfileLabComponent item : this.lab)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ClinicalProfileLabComponent addLab() { //3
      ClinicalProfileLabComponent t = new ClinicalProfileLabComponent();
      if (this.lab == null)
        this.lab = new ArrayList<ClinicalProfileLabComponent>();
      this.lab.add(t);
      return t;
    }

    public ClinicalProfile addLab(ClinicalProfileLabComponent t) { //3
      if (t == null)
        return this;
      if (this.lab == null)
        this.lab = new ArrayList<ClinicalProfileLabComponent>();
      this.lab.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #lab}, creating it if it does not already exist
     */
    public ClinicalProfileLabComponent getLabFirstRep() { 
      if (getLab().isEmpty()) {
        addLab();
      }
      return getLab().get(0);
    }

    /**
     * @return {@link #medication} (Medication profile entry.)
     */
    public List<ClinicalProfileMedicationComponent> getMedication() { 
      if (this.medication == null)
        this.medication = new ArrayList<ClinicalProfileMedicationComponent>();
      return this.medication;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setMedication(List<ClinicalProfileMedicationComponent> theMedication) { 
      this.medication = theMedication;
      return this;
    }

    public boolean hasMedication() { 
      if (this.medication == null)
        return false;
      for (ClinicalProfileMedicationComponent item : this.medication)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ClinicalProfileMedicationComponent addMedication() { //3
      ClinicalProfileMedicationComponent t = new ClinicalProfileMedicationComponent();
      if (this.medication == null)
        this.medication = new ArrayList<ClinicalProfileMedicationComponent>();
      this.medication.add(t);
      return t;
    }

    public ClinicalProfile addMedication(ClinicalProfileMedicationComponent t) { //3
      if (t == null)
        return this;
      if (this.medication == null)
        this.medication = new ArrayList<ClinicalProfileMedicationComponent>();
      this.medication.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #medication}, creating it if it does not already exist
     */
    public ClinicalProfileMedicationComponent getMedicationFirstRep() { 
      if (getMedication().isEmpty()) {
        addMedication();
      }
      return getMedication().get(0);
    }

    /**
     * @return {@link #diagnosis} (Diagnosis profile entry.)
     */
    public List<ClinicalProfileDiagnosisComponent> getDiagnosis() { 
      if (this.diagnosis == null)
        this.diagnosis = new ArrayList<ClinicalProfileDiagnosisComponent>();
      return this.diagnosis;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setDiagnosis(List<ClinicalProfileDiagnosisComponent> theDiagnosis) { 
      this.diagnosis = theDiagnosis;
      return this;
    }

    public boolean hasDiagnosis() { 
      if (this.diagnosis == null)
        return false;
      for (ClinicalProfileDiagnosisComponent item : this.diagnosis)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ClinicalProfileDiagnosisComponent addDiagnosis() { //3
      ClinicalProfileDiagnosisComponent t = new ClinicalProfileDiagnosisComponent();
      if (this.diagnosis == null)
        this.diagnosis = new ArrayList<ClinicalProfileDiagnosisComponent>();
      this.diagnosis.add(t);
      return t;
    }

    public ClinicalProfile addDiagnosis(ClinicalProfileDiagnosisComponent t) { //3
      if (t == null)
        return this;
      if (this.diagnosis == null)
        this.diagnosis = new ArrayList<ClinicalProfileDiagnosisComponent>();
      this.diagnosis.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #diagnosis}, creating it if it does not already exist
     */
    public ClinicalProfileDiagnosisComponent getDiagnosisFirstRep() { 
      if (getDiagnosis().isEmpty()) {
        addDiagnosis();
      }
      return getDiagnosis().get(0);
    }

    /**
     * @return {@link #procedure} (Procedure profile entry.)
     */
    public List<ClinicalProfileProcedureComponent> getProcedure() { 
      if (this.procedure == null)
        this.procedure = new ArrayList<ClinicalProfileProcedureComponent>();
      return this.procedure;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setProcedure(List<ClinicalProfileProcedureComponent> theProcedure) { 
      this.procedure = theProcedure;
      return this;
    }

    public boolean hasProcedure() { 
      if (this.procedure == null)
        return false;
      for (ClinicalProfileProcedureComponent item : this.procedure)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ClinicalProfileProcedureComponent addProcedure() { //3
      ClinicalProfileProcedureComponent t = new ClinicalProfileProcedureComponent();
      if (this.procedure == null)
        this.procedure = new ArrayList<ClinicalProfileProcedureComponent>();
      this.procedure.add(t);
      return t;
    }

    public ClinicalProfile addProcedure(ClinicalProfileProcedureComponent t) { //3
      if (t == null)
        return this;
      if (this.procedure == null)
        this.procedure = new ArrayList<ClinicalProfileProcedureComponent>();
      this.procedure.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #procedure}, creating it if it does not already exist
     */
    public ClinicalProfileProcedureComponent getProcedureFirstRep() { 
      if (getProcedure().isEmpty()) {
        addProcedure();
      }
      return getProcedure().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "A formal identifier that is used to identify this ClinicalProfile when it is represented in other formats or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("status", "code", "The ClinicalProfile status.", 0, 1, status));
        children.add(new Property("population", "Reference(Group)", "The base population against which this profile was generated.", 0, 1, population));
        children.add(new Property("cohort", "Reference(Group)", "The cohort within the population that this profile represents.", 0, 1, cohort));
        children.add(new Property("date", "dateTime", "When the profile was generated.", 0, 1, date));
        children.add(new Property("source", "Identifier", "Identifier(s) from where the profile was acquired.", 0, java.lang.Integer.MAX_VALUE, source));
        children.add(new Property("reporter", "Reference(Organization|Practitioner|PractitionerRole|Location)", "Who is reporting the data.", 0, 1, reporter));
        children.add(new Property("lab", "", "Laboratory profile entry.", 0, java.lang.Integer.MAX_VALUE, lab));
        children.add(new Property("medication", "", "Medication profile entry.", 0, java.lang.Integer.MAX_VALUE, medication));
        children.add(new Property("diagnosis", "", "Diagnosis profile entry.", 0, java.lang.Integer.MAX_VALUE, diagnosis));
        children.add(new Property("procedure", "", "Procedure profile entry.", 0, java.lang.Integer.MAX_VALUE, procedure));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A formal identifier that is used to identify this ClinicalProfile when it is represented in other formats or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -892481550: /*status*/  return new Property("status", "code", "The ClinicalProfile status.", 0, 1, status);
        case -2023558323: /*population*/  return new Property("population", "Reference(Group)", "The base population against which this profile was generated.", 0, 1, population);
        case -1354961931: /*cohort*/  return new Property("cohort", "Reference(Group)", "The cohort within the population that this profile represents.", 0, 1, cohort);
        case 3076014: /*date*/  return new Property("date", "dateTime", "When the profile was generated.", 0, 1, date);
        case -896505829: /*source*/  return new Property("source", "Identifier", "Identifier(s) from where the profile was acquired.", 0, java.lang.Integer.MAX_VALUE, source);
        case -427039519: /*reporter*/  return new Property("reporter", "Reference(Organization|Practitioner|PractitionerRole|Location)", "Who is reporting the data.", 0, 1, reporter);
        case 106893: /*lab*/  return new Property("lab", "", "Laboratory profile entry.", 0, java.lang.Integer.MAX_VALUE, lab);
        case 1998965455: /*medication*/  return new Property("medication", "", "Medication profile entry.", 0, java.lang.Integer.MAX_VALUE, medication);
        case 1196993265: /*diagnosis*/  return new Property("diagnosis", "", "Diagnosis profile entry.", 0, java.lang.Integer.MAX_VALUE, diagnosis);
        case -1095204141: /*procedure*/  return new Property("procedure", "", "Procedure profile entry.", 0, java.lang.Integer.MAX_VALUE, procedure);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<ClinicalProfileStatus>
        case -2023558323: /*population*/ return this.population == null ? new Base[0] : new Base[] {this.population}; // Reference
        case -1354961931: /*cohort*/ return this.cohort == null ? new Base[0] : new Base[] {this.cohort}; // Reference
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case -896505829: /*source*/ return this.source == null ? new Base[0] : this.source.toArray(new Base[this.source.size()]); // Identifier
        case -427039519: /*reporter*/ return this.reporter == null ? new Base[0] : new Base[] {this.reporter}; // Reference
        case 106893: /*lab*/ return this.lab == null ? new Base[0] : this.lab.toArray(new Base[this.lab.size()]); // ClinicalProfileLabComponent
        case 1998965455: /*medication*/ return this.medication == null ? new Base[0] : this.medication.toArray(new Base[this.medication.size()]); // ClinicalProfileMedicationComponent
        case 1196993265: /*diagnosis*/ return this.diagnosis == null ? new Base[0] : this.diagnosis.toArray(new Base[this.diagnosis.size()]); // ClinicalProfileDiagnosisComponent
        case -1095204141: /*procedure*/ return this.procedure == null ? new Base[0] : this.procedure.toArray(new Base[this.procedure.size()]); // ClinicalProfileProcedureComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(castToIdentifier(value)); // Identifier
          return value;
        case -892481550: // status
          value = new ClinicalProfileStatusEnumFactory().fromType(castToCode(value));
          this.status = (Enumeration) value; // Enumeration<ClinicalProfileStatus>
          return value;
        case -2023558323: // population
          this.population = castToReference(value); // Reference
          return value;
        case -1354961931: // cohort
          this.cohort = castToReference(value); // Reference
          return value;
        case 3076014: // date
          this.date = castToDateTime(value); // DateTimeType
          return value;
        case -896505829: // source
          this.getSource().add(castToIdentifier(value)); // Identifier
          return value;
        case -427039519: // reporter
          this.reporter = castToReference(value); // Reference
          return value;
        case 106893: // lab
          this.getLab().add((ClinicalProfileLabComponent) value); // ClinicalProfileLabComponent
          return value;
        case 1998965455: // medication
          this.getMedication().add((ClinicalProfileMedicationComponent) value); // ClinicalProfileMedicationComponent
          return value;
        case 1196993265: // diagnosis
          this.getDiagnosis().add((ClinicalProfileDiagnosisComponent) value); // ClinicalProfileDiagnosisComponent
          return value;
        case -1095204141: // procedure
          this.getProcedure().add((ClinicalProfileProcedureComponent) value); // ClinicalProfileProcedureComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(castToIdentifier(value));
        } else if (name.equals("status")) {
          value = new ClinicalProfileStatusEnumFactory().fromType(castToCode(value));
          this.status = (Enumeration) value; // Enumeration<ClinicalProfileStatus>
        } else if (name.equals("population")) {
          this.population = castToReference(value); // Reference
        } else if (name.equals("cohort")) {
          this.cohort = castToReference(value); // Reference
        } else if (name.equals("date")) {
          this.date = castToDateTime(value); // DateTimeType
        } else if (name.equals("source")) {
          this.getSource().add(castToIdentifier(value));
        } else if (name.equals("reporter")) {
          this.reporter = castToReference(value); // Reference
        } else if (name.equals("lab")) {
          this.getLab().add((ClinicalProfileLabComponent) value);
        } else if (name.equals("medication")) {
          this.getMedication().add((ClinicalProfileMedicationComponent) value);
        } else if (name.equals("diagnosis")) {
          this.getDiagnosis().add((ClinicalProfileDiagnosisComponent) value);
        } else if (name.equals("procedure")) {
          this.getProcedure().add((ClinicalProfileProcedureComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case -892481550:  return getStatusElement();
        case -2023558323:  return getPopulation(); 
        case -1354961931:  return getCohort(); 
        case 3076014:  return getDateElement();
        case -896505829:  return addSource(); 
        case -427039519:  return getReporter(); 
        case 106893:  return addLab(); 
        case 1998965455:  return addMedication(); 
        case 1196993265:  return addDiagnosis(); 
        case -1095204141:  return addProcedure(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -892481550: /*status*/ return new String[] {"code"};
        case -2023558323: /*population*/ return new String[] {"Reference"};
        case -1354961931: /*cohort*/ return new String[] {"Reference"};
        case 3076014: /*date*/ return new String[] {"dateTime"};
        case -896505829: /*source*/ return new String[] {"Identifier"};
        case -427039519: /*reporter*/ return new String[] {"Reference"};
        case 106893: /*lab*/ return new String[] {};
        case 1998965455: /*medication*/ return new String[] {};
        case 1196993265: /*diagnosis*/ return new String[] {};
        case -1095204141: /*procedure*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.status");
        }
        else if (name.equals("population")) {
          this.population = new Reference();
          return this.population;
        }
        else if (name.equals("cohort")) {
          this.cohort = new Reference();
          return this.cohort;
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.date");
        }
        else if (name.equals("source")) {
          return addSource();
        }
        else if (name.equals("reporter")) {
          this.reporter = new Reference();
          return this.reporter;
        }
        else if (name.equals("lab")) {
          return addLab();
        }
        else if (name.equals("medication")) {
          return addMedication();
        }
        else if (name.equals("diagnosis")) {
          return addDiagnosis();
        }
        else if (name.equals("procedure")) {
          return addProcedure();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "ClinicalProfile";

  }

      public ClinicalProfile copy() {
        ClinicalProfile dst = new ClinicalProfile();
        copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        dst.population = population == null ? null : population.copy();
        dst.cohort = cohort == null ? null : cohort.copy();
        dst.date = date == null ? null : date.copy();
        if (source != null) {
          dst.source = new ArrayList<Identifier>();
          for (Identifier i : source)
            dst.source.add(i.copy());
        };
        dst.reporter = reporter == null ? null : reporter.copy();
        if (lab != null) {
          dst.lab = new ArrayList<ClinicalProfileLabComponent>();
          for (ClinicalProfileLabComponent i : lab)
            dst.lab.add(i.copy());
        };
        if (medication != null) {
          dst.medication = new ArrayList<ClinicalProfileMedicationComponent>();
          for (ClinicalProfileMedicationComponent i : medication)
            dst.medication.add(i.copy());
        };
        if (diagnosis != null) {
          dst.diagnosis = new ArrayList<ClinicalProfileDiagnosisComponent>();
          for (ClinicalProfileDiagnosisComponent i : diagnosis)
            dst.diagnosis.add(i.copy());
        };
        if (procedure != null) {
          dst.procedure = new ArrayList<ClinicalProfileProcedureComponent>();
          for (ClinicalProfileProcedureComponent i : procedure)
            dst.procedure.add(i.copy());
        };
        return dst;
      }

      protected ClinicalProfile typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfile))
          return false;
        ClinicalProfile o = (ClinicalProfile) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(population, o.population, true)
           && compareDeep(cohort, o.cohort, true) && compareDeep(date, o.date, true) && compareDeep(source, o.source, true)
           && compareDeep(reporter, o.reporter, true) && compareDeep(lab, o.lab, true) && compareDeep(medication, o.medication, true)
           && compareDeep(diagnosis, o.diagnosis, true) && compareDeep(procedure, o.procedure, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfile))
          return false;
        ClinicalProfile o = (ClinicalProfile) other_;
        return compareValues(status, o.status, true) && compareValues(date, o.date, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, population
          , cohort, date, source, reporter, lab, medication, diagnosis, procedure);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.ClinicalProfile;
   }

 /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>The date of the clinical profile</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ClinicalProfile.date</b><br>
   * </p>
   */
  @SearchParamDefinition(name="date", path="ClinicalProfile.date", description="The date of the clinical profile", type="date" )
  public static final String SP_DATE = "date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>The date of the clinical profile</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ClinicalProfile.date</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DATE);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>External identifier of the clinical profile to be returned</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="ClinicalProfile.identifier", description="External identifier of the clinical profile to be returned", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>External identifier of the clinical profile to be returned</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>cohort</b>
   * <p>
   * Description: <b>The cohort being profiled</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.cohort</b><br>
   * </p>
   */
  @SearchParamDefinition(name="cohort", path="ClinicalProfile.cohort.where(resolve() is Group)", description="The cohort being profiled", type="reference", target={Group.class } )
  public static final String SP_COHORT = "cohort";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>cohort</b>
   * <p>
   * Description: <b>The cohort being profiled</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.cohort</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam COHORT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_COHORT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ClinicalProfile:cohort</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_COHORT = new ca.uhn.fhir.model.api.Include("ClinicalProfile:cohort").toLocked();

 /**
   * Search parameter: <b>reporter</b>
   * <p>
   * Description: <b>The reporter to return clinical profile results for</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.reporter</b><br>
   * </p>
   */
  @SearchParamDefinition(name="reporter", path="ClinicalProfile.reporter", description="The reporter to return clinical profile results for", type="reference", target={Location.class, Organization.class, Practitioner.class, PractitionerRole.class } )
  public static final String SP_REPORTER = "reporter";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>reporter</b>
   * <p>
   * Description: <b>The reporter to return clinical profile results for</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.reporter</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REPORTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_REPORTER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ClinicalProfile:reporter</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REPORTER = new ca.uhn.fhir.model.api.Include("ClinicalProfile:reporter").toLocked();

 /**
   * Search parameter: <b>population</b>
   * <p>
   * Description: <b>The  population being profiled</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.population</b><br>
   * </p>
   */
  @SearchParamDefinition(name="population", path="ClinicalProfile.population.where(resolve() is Group)", description="The  population being profiled", type="reference", target={Group.class } )
  public static final String SP_POPULATION = "population";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>population</b>
   * <p>
   * Description: <b>The  population being profiled</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.population</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam POPULATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_POPULATION);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ClinicalProfile:population</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_POPULATION = new ca.uhn.fhir.model.api.Include("ClinicalProfile:population").toLocked();

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The status of the profile</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="ClinicalProfile.status", description="The status of the profile", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The status of the profile</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);


}

