package mhsoft.permissions.dto;

import java.io.Serializable;

public class UserClientRoleDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private final long id;
  private final boolean locked;

  public UserClientRoleDto(final long id, final boolean locked) {
    super();
    this.id = id;
    this.locked = locked;
  }

  public Long getId() {
    return this.id;
  }

  public boolean getLocked() {
    return this.locked;
  }

}