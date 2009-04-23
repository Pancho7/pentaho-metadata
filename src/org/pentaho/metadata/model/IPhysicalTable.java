package org.pentaho.metadata.model;

import java.util.List;

import org.pentaho.metadata.model.concept.IConcept;

public interface IPhysicalTable extends IConcept {
  
  public List<IPhysicalColumn> getPhysicalColumns();
}