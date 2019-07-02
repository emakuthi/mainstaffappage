// Generated code from Butter Knife. Do not modify!
package com.staff.staffapp.ui;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.tabs.TabLayout;
import com.staff.staffapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ProductLandingActivity_ViewBinding implements Unbinder {
  private ProductLandingActivity target;

  @UiThread
  public ProductLandingActivity_ViewBinding(ProductLandingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ProductLandingActivity_ViewBinding(ProductLandingActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.tabLayout = Utils.findRequiredViewAsType(source, R.id.tabLayout, "field 'tabLayout'", TabLayout.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'viewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ProductLandingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.tabLayout = null;
    target.viewPager = null;
  }
}
