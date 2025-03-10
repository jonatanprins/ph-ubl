/*
 * Copyright (C) 2014-2021 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.ubl23;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.jaxb.builder.JAXBReaderBuilder;

/**
 * A reader builder for UBL 2.3 documents.
 *
 * @author Philip Helger
 * @param <JAXBTYPE>
 *        The UBL 2.3 implementation class to be read
 */
@NotThreadSafe
public class UBL23ReaderBuilder <JAXBTYPE> extends JAXBReaderBuilder <JAXBTYPE, UBL23ReaderBuilder <JAXBTYPE>>
{
  public UBL23ReaderBuilder (@Nonnull final EUBL23DocumentType eDocType, @Nonnull final Class <JAXBTYPE> aImplClass)
  {
    super (eDocType, aImplClass);
  }

  public UBL23ReaderBuilder (@Nonnull final Class <JAXBTYPE> aClass)
  {
    this (UBL23DocumentTypes.getDocumentTypeOfImplementationClass (aClass), aClass);
  }

  /**
   * Create a new reader builder.
   *
   * @param aClass
   *        The UBL class to be read. May not be <code>null</code>.
   * @return The new reader builder. Never <code>null</code>.
   * @param <T>
   *        The UBL 2.3 document implementation type
   */
  @Nonnull
  public static <T> UBL23ReaderBuilder <T> create (@Nonnull final Class <T> aClass)
  {
    return new UBL23ReaderBuilder <> (aClass);
  }

  /**
   * Create a new reader builder that is not typed, because only the document
   * type enumeration value is available.
   *
   * @param eDocType
   *        The UBL 2.3 document type to be read. May not be <code>null</code> .
   * @return The new reader builder. Never <code>null</code>.
   */
  @Nonnull
  public static UBL23ReaderBuilder <?> createGeneric (@Nonnull final EUBL23DocumentType eDocType)
  {
    return new UBL23ReaderBuilder <> (eDocType, Object.class);
  }
}
