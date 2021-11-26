<style>
.mini-card a {
  border: solid 1px #333;
  background-color: #FFF;
  color: #333;
  line-height: 1.5em;
  font-size: 0.7em;
  max-width: 9em;
  margin:10px;
  width: 100%;
}
</style>
<div class="col-12 p-0 m-0">
    <div class="mini-card text-center">
        <a href="${LinkToPage.getFriendlyUrl()}" class="btn">
            <@liferay_ui["icon"]
            icon="${IconType.getData()}"
            markupView="lexicon"
            message="${Title.getData()}"
            />
            <br/>
            ${Title.getData()}
        </a>
    </div>
</div>