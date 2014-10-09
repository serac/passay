/* See LICENSE for licensing and NOTICE for copyright. */
package org.passay;

/**
 * Rule for determining if a password contains the correct number of digit
 * characters. Characters are defined in {@link #CHARS}.
 *
 * @author  Middleware Services
 */
public class DigitCharacterRule extends AbstractCharacterRule
{

  /** Digit characters, value is {@value}. */
  public static final String CHARS = "0123456789";

  /** Character type. */
  private static final String CHARACTER_TYPE = "digit";

  /** Default constructor. */
  public DigitCharacterRule() {}


  /**
   * Create a new digit character rule.
   *
   * @param  num  of digit characters to enforce
   */
  public DigitCharacterRule(final int num)
  {
    setNumberOfCharacters(num);
  }


  @Override
  public String getValidCharacters()
  {
    return CHARS;
  }


  @Override
  protected int getNumberOfCharacterType(final String password)
  {
    return PasswordUtils.getMatchingCharacterCount(CHARS, password);
  }


  @Override
  protected String getCharacterType()
  {
    return CHARACTER_TYPE;
  }
}
