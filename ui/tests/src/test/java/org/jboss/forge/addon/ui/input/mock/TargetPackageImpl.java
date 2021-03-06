/**
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.addon.ui.input.mock;

import javax.inject.Inject;

import org.jboss.forge.addon.ui.hints.InputType;
import org.jboss.forge.addon.ui.input.AbstractUIInputDecorator;
import org.jboss.forge.addon.ui.input.UIInput;
import org.jboss.forge.addon.ui.metadata.WithAttributes;

/**
 *
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public class TargetPackageImpl extends AbstractUIInputDecorator<String>implements TargetPackage
{
   @Inject
   @WithAttributes(label = "Target Package", type = InputType.JAVA_PACKAGE_PICKER)
   private UIInput<String> targetPackage;

   @Override
   protected UIInput<String> createDelegate()
   {
      return targetPackage;
   }
}
